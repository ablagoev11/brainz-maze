package com.learningapp.web.dtos;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Br_maze_quizDto {

    private Long id;

    @Column(name = "resource_id")
    private Integer resourceId;

    @ElementCollection
    @CollectionTable(name = "quiz_questions", joinColumns = @JoinColumn(name = "quiz_id"))
    @Column(name = "question")
    private List<String> questions;

    @ElementCollection
    @CollectionTable(name = "quiz_answers", joinColumns = @JoinColumn(name = "quiz_id"))
    @Column(name = "answer")
    private List<String> answers;

    @Column(name = "results_id")
    private Long resultsId;

    @Column(name = "mdle_student_id")
    private Integer mdleStudentId;
}
