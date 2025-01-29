package com.brainzmaze.rest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mdle_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    public void setFlashcards(List<Flashcard> flashcards) {
        this.flashcards = flashcards;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    @ManyToMany
    @JoinTable(
            name = "user_course",
            joinColumns = @JoinColumn(name="course_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Resource> resources = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private List<Flashcard> flashcards;

    @OneToMany(mappedBy = "course")
    private List<Quiz> quizzes;
}
