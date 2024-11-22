package com.learningapp.web.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "results") // Table names are conventionally lowercase
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "points_from_quizzes")
    private Integer[] pointsFromQuizzes;

    @Column(name = "mdlestudent_id")
    private Integer mdleStudentId;
}
