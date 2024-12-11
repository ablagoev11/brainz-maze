package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.QuizResultDto;
import com.brainzmaze.rest.models.QuizResult;

public class QuizResultMapper {
    public static QuizResultDto toDto(QuizResult quizResult) {
        QuizResultDto dto = new QuizResultDto();
        dto.setId(quizResult.getId());
        dto.setScore(quizResult.getScore());
        dto.setAttemptedOn(quizResult.getAttemptedOn());
        return dto;
    }
    public static QuizResult toModel(QuizResultDto dto) {
        QuizResult quizResult = new QuizResult();
        quizResult.setId(dto.getId());
        quizResult.setScore(dto.getScore());
        quizResult.setAttemptedOn(dto.getAttemptedOn());
        return quizResult;
    }
}
