package com.learningapp.web.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultDto {

    private Long id;

    @Column(name = "points_from_quizzes")
    private Integer[] pointsFromQuizzes;

    @Column(name = "mdlestudent_id")
    private Integer mdleStudentId;
}
