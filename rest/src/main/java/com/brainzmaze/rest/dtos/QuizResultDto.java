package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizResultDto {
    private Long id;
    private int score;
    private LocalDateTime attemptedOn;
    private Long quizId;
    private Long userId;
}
