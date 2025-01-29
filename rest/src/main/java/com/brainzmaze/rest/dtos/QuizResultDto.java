package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
public class QuizResultDto {
    private Long id;
    private int score;
    private LocalDateTime attemptedOn;

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDateTime getAttemptedOn() {
        return attemptedOn;
    }

    public void setAttemptedOn(LocalDateTime attemptedOn) {
        this.attemptedOn = attemptedOn;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Long quizId;
    private Long userId;
}
