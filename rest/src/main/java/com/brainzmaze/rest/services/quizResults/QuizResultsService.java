package com.brainzmaze.rest.services.quizResults;

import com.brainzmaze.rest.dtos.QuizResultDto;
import com.brainzmaze.rest.models.QuizResult;

import java.util.List;

public interface QuizResultsService {
    QuizResultDto createQuizResults(QuizResultDto quizResultsDto);
    QuizResult getQuizResultsById(Long id);
    QuizResultDto getQuizResultsDto(Long id);
    List<QuizResult> getQuizResultsByIds(List<Long> ids);
}
