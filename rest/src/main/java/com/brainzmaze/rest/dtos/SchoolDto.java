package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class SchoolDto {
    private Long id;
    private String name;
    private String domain;
    private String description;
    private List<Long> coursesId;
    private List<Long> usersId;
    private String moodleToken;

    public String getMoodleToken() {
        return moodleToken;
    }

    public void setMoodleToken(String moodleToken) {
        this.moodleToken = moodleToken;
    }
      // Added token field

    public List<Long> getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(List<Long> coursesId) {
        this.coursesId = coursesId;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getUsersId() {
        return usersId;
    }

    public void setUsersId(List<Long> usersId) {
        this.usersId = usersId;
    }


}

