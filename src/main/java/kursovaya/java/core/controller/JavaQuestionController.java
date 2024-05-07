package kursovaya.java.core.controller;

import kursovaya.java.core.service.ExaminerService;
import kursovaya.java.core.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class JavaQuestionController {
    private final QuestionService questionService;
    private final ExaminerService examinerService;

    public JavaQuestionController(QuestionService questionService,
                                  ExaminerService examinerService) {
        this.questionService = questionService;
        this.examinerService = examinerService;
    }



    @GetMapping
    public String getAll() {
        return questionService.getAll().toString();
    }

    @GetMapping("/add")
    public String add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        questionService.add(question, answer);
        return "объект Question добавлен\n" +
                question + "\n" +
                answer + "\n";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        questionService.remove(question, answer);
        return "объект Question удален\n" +
                question + "\n" +
                answer + "\n";
    }

    @GetMapping("/get/question/{amount}")
    public String getQuestion(@PathVariable("amount") int amount, @RequestParam("question") String question, @RequestParam("answer") String answer) {

        return examinerService.getQuestions3(amount) +
                "<h1>Случайный вопрос: \n</h1>" +
                question + "\n" +
                answer + "\n";

    }
}
