package com.learningapp.web.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mdle_studentDto {

    private Long id;

    @Column(name = "name")
    private String name;
    //TO DO: private static Id[] mdle_courses;
}
