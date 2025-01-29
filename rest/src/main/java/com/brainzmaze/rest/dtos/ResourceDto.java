package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class ResourceDto {
    private Long id;
    private String name;
    private String type;
    private String url;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getFlashcardsId() {
        return flashcardsId;
    }

    public void setFlashcardsId(List<Long> flashcardsId) {
        this.flashcardsId = flashcardsId;
    }

    public List<Long> getQuizzesId() {
        return quizzesId;
    }

    public void setQuizzesId(List<Long> quizzesId) {
        this.quizzesId = quizzesId;
    }

    private Long courseId;
    private List<Long> flashcardsId;
    private List<Long> quizzesId;

}
