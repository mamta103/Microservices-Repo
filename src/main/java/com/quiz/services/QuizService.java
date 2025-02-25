package com.quiz.services;

import com.quiz.entities.Quiz;

import java.util.List;

public interface QuizService {


    Quiz create(Quiz quiz);
    public List<Quiz> getAll();
    public Quiz getById(Long id);
}
