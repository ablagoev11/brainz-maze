package com.learningapp.web.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mdle_teacherDto {

    private Long id;

    @Column(name = "name")
    private String name;
    //TO do: private static Id[] mdle_courses;

}
