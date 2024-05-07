package kursovaya.java.core.service;

import kursovaya.java.core.exception.NullCollectionException;
import kursovaya.java.core.exception.ParameterIsNullException;
import kursovaya.java.core.question.Question;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class JavaQuestionService implements QuestionService {

        Set<Question> questions = new HashSet<>();

@Override
public void add(String question, String answer) {
        validateParameter(question);
        validateParameter(answer);
        questions.add(new Question(question, answer));
        System.out.println("объект Question добавлен\n" +
        question + "\n" +
        answer + "\n");
        }

@Override
public void remove(String question, String answer) {
        validateParameter(question);
        validateParameter(answer);
        Question questionNeedRemove = new Question(question, answer);
        questions.remove(questionNeedRemove);
        System.out.println("объект Question удален\n" +
        question + "\n" +
        answer + "\n");
        }

@Override
public Set <Question> getAll() {
        for (Question question : questions) {
        System.out.println("Все вопросы:\n" + question);
        }
        return questions;
        }

@Override
public Question getRandomQuestion() {
        validateCollectionIsNotNull();
        int size = questions.size();
        int item = new Random().nextInt(size);
        int i = 0;
        Question rez = null;
        for (Question element : questions) {
        if (i == item) {
        rez = element;
        }
        i++;
        }
        return rez;
        }
private void validateCollectionIsNotNull() {
        if (questions.isEmpty()) {
        throw new NullCollectionException("Collection is empty");
        }
        }
private void validateParameter(String parameter) {
        if (parameter.equals("")) {
        throw new ParameterIsNullException("The user forgot to enter a question or answer");
        }
        }
        }
