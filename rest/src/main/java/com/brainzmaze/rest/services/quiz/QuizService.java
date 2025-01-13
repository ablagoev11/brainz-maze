package com.brainzmaze.rest.services.quiz;

import com.brainzmaze.rest.dtos.QuizDto;
import com.brainzmaze.rest.models.Quiz;

import java.util.List;

public interface QuizService {
   QuizDto createQuiz(QuizDto quizDto);
   Quiz getQuizById(Long id);
   List<Quiz> getQuizByIds(List<Long> ids);

   QuizDto getQuizDto(Long id);
}
