package com.brainzmaze.rest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "br_quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String correctAnswers;

    @Column(nullable = false)
    private boolean isMultipleChoice;

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public List<QuizResult> getQuizResults() {
        return quizResults;
    }

    public void setQuizResults(List<QuizResult> quizResults) {
        this.quizResults = quizResults;
    }

    @Column
    private String choices;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @OneToMany(mappedBy = "quiz")
    private List<QuizResult> quizResults;

}
