package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class CourseDto{
    private Long id;
    private String title;
    private String description;
    private Long schoolId;
    private List<Long> userIds;
    private List<Long> resourceIds;

    public List<Long> getFlashcardIds() {
        return flashcardIds;
    }

    public void setFlashcardIds(List<Long> flashcardIds) {
        this.flashcardIds = flashcardIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public List<Long> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<Long> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public List<Long> getQuizIds() {
        return quizIds;
    }

    public void setQuizIds(List<Long> quizIds) {
        this.quizIds = quizIds;
    }

    private List<Long> flashcardIds;
    private List<Long> quizIds;
}
