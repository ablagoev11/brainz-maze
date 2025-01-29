package com.brainzmaze.rest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mdle_school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    public void setMoodleToken(String moodleToken) {
        this.MoodleToken = moodleToken;
    }

    public String getMoodleToken() {
        return MoodleToken;
    }

    @Column(name = "MoodleToken")
    private String MoodleToken;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "domain")
    private String domain;

    @Column(name = "description")
    private String description;

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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();


}
