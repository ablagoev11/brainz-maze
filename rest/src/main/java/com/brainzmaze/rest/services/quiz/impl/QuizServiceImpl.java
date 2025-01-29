package com.brainzmaze.rest.services.quiz.impl;

import com.brainzmaze.rest.dtos.QuizDto;
import com.brainzmaze.rest.mappers.QuizMapper;
import com.brainzmaze.rest.models.Quiz;
import com.brainzmaze.rest.repositories.QuizRepository;
import com.brainzmaze.rest.services.quiz.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;
    private final QuizMapper quizMapper;

    @Override
    public QuizDto createQuiz(QuizDto quizDto) {
        Quiz quiz = quizMapper.toModel(quizDto);
        Quiz savedQuiz = quizRepository.save(quiz);
        return quizMapper.toDto(savedQuiz);
    }

    public QuizServiceImpl(QuizRepository quizRepository, QuizMapper quizMapper) {
        this.quizRepository = quizRepository;
        this.quizMapper = quizMapper;
    }

    @Override
    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with id: " + id));
    }
    public List<Quiz> getQuizByIds(List<Long> ids) {
        return quizRepository.findAllById(ids);
    }
    @Override
    public QuizDto getQuizDto(Long id) {
        Quiz quiz = getQuizById(id);
        return quizMapper.toDto(quiz);
    }
}
