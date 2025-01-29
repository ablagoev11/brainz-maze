package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
    private Long id;
    private String question;
    private String correctAnswers;
    private boolean isMultipleChoice;
    private String choices;
    private Long courseId;
    private Long resourceId;
    private List<Long> quizResultsIds;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    public void setMultipleChoice(boolean multipleChoice) {
        isMultipleChoice = multipleChoice;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public List<Long> getQuizResultsIds() {
        return quizResultsIds;
    }

    public void setQuizResultsIds(List<Long> quizResultsIds) {
        this.quizResultsIds = quizResultsIds;
    }
}
