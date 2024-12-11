package com.brainzmaze.rest.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
    private Long id;
    private String question;
    private String correctAnswers;
    private boolean isMultipleChoice;
    private String choices;
}
