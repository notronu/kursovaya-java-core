package kursovaya.java.core.controller;

import kursovaya.java.core.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ExamController {
    private ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public String getQuestions(@PathVariable("amount") int amount) {
        return "<h1>" + examinerService.getQuestions3(amount) + "</h1>";
    }
}
