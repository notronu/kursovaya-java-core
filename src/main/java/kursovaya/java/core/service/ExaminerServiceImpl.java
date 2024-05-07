package kursovaya.java.core.service;

import kursovaya.java.core.exception.NumberOfQuestionsExceededException;
import kursovaya.java.core.question.Question;

import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Set<Question> getQuestions3(int amount){
        Set<Question> questions = new HashSet<>();
        if (questionService.getAll().size() < amount) {
            throw new NumberOfQuestionsExceededException("\n" +
                    "Exceeded quantity");
        }

        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }

        return   questions;
    }
}
