package com.learningapp.web.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatisticDto {

    private Long id;

    @Column(name = "results_id")
    private Integer resultsId;
}
