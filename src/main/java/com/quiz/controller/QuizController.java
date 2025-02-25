package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz create(Quiz quiz) {
        return quizService.create(quiz);
    }

    @GetMapping
    public List<Quiz> getAll() {
        return quizService.getAll();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id) {
        return quizService.getById(id);
    }


}
