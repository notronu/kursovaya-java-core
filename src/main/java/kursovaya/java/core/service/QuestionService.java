package kursovaya.java.core.service;

import kursovaya.java.core.question.Question;

import java.util.Set;

public interface QuestionService {

    void add(String question, String answer);

    void remove(String question, String answer);

    Set<Question> getAll();

    Question getRandomQuestion();


}
