package kursovaya.java.core.service;

import kursovaya.java.core.question.Question;

import java.util.Set;

public interface ExaminerService {

    Set<Question> getQuestions3(int amount);
}
