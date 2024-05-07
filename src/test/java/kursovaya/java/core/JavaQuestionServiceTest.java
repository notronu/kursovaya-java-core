package kursovaya.java.core;

import kursovaya.java.core.question.Question;
import kursovaya.java.core.service.JavaQuestionService;
import kursovaya.java.core.service.QuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaQuestionServiceTest {
    private QuestionService questionService;

    @BeforeEach
    public void setUp() {
        questionService = new JavaQuestionService();
    }


    @Test
    public void getAll1Test() {
        Set<Question> expected = new HashSet<>();
        Set<Question> actual = questionService.getAll();


        assertEquals(expected, actual);
    }

    @Test
    public void addTest1() {
        Question q = new Question("как дела?", "хорошо");
        Set<Question> expected = new HashSet<>();
        expected.add(q);

        questionService.add("как дела?", "хорошо");
        Set<Question> actual = questionService.getAll();

        assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        Question q = new Question("что делаешь?", "читаю");
        Question q2 = new Question("что потом будешь делать?", "спать");
        Set<Question> expected = new HashSet<>();
        expected.add(q);
        expected.add(q2);

        questionService.add("что делаешь?", "читаю");
        questionService.add("что потом будешь делать?", "спать");
        Set<Question> actual = questionService.getAll();

        assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {

        Question q1 = new Question("кто ты?", "я студент");
        Set<Question> expected = new HashSet<>();
        expected.add(q1);

        questionService.add("кто ты?", "я студент");
        questionService.add("чем занимаешься?", "учусь");
        questionService.remove("чем занимаешься?", "учусь");
        Set<Question> actual = questionService.getAll();

        assertEquals(expected, actual);
    }

}
