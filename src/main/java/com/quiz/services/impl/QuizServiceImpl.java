package com.quiz.services.impl;

import com.quiz.entities.Quiz;
import com.quiz.exceptions.QuizNotFoundException;
import com.quiz.repositories.QuizRepository;
import com.quiz.services.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;
    private static final Logger logger = LoggerFactory.getLogger(QuizServiceImpl.class);

    @Override
    public Quiz create(Quiz quiz) {
        logger.info("Creating new quiz with title: {}", quiz.getTitle());
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        logger.info("Fetching all quizzes");
        return quizRepository.findAll();
    }

    @Override
    public Quiz getById(Long id) {
        logger.info("Fetching quiz with id: {}", id);
        return quizRepository.findById(id).orElseThrow(()-> new QuizNotFoundException("Quiz not found with id:"+ id));
    }
}
