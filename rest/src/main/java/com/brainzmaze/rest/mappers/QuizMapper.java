package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.QuizDto;
import com.brainzmaze.rest.models.Quiz;

public class QuizMapper {
    public static QuizDto toDto(Quiz quiz) {
        QuizDto dto = new QuizDto();
        dto.setId(quiz.getId());
        dto.setChoices(quiz.getChoices());
        dto.setQuestion(quiz.getQuestion());
        dto.setCorrectAnswers(quiz.getCorrectAnswers());
        dto.setMultipleChoice(quiz.isMultipleChoice());
        return dto;
    }

    public static Quiz toModel(QuizDto dto) {
        Quiz quiz = new Quiz();
        quiz.setId(dto.getId());
        quiz.setChoices(dto.getChoices());
        quiz.setQuestion(dto.getQuestion());
        quiz.setCorrectAnswers(dto.getCorrectAnswers());
        quiz.setMultipleChoice(dto.isMultipleChoice());
        return quiz;
    }
}
