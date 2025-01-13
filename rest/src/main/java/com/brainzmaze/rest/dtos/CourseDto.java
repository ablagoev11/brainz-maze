package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto{
    private Long id;
    private String title;
    private String description;
    private Long schoolId;
    private List<Long> userIds;
    private List<Long> resourceIds;
    private List<Long> flashcardIds;
    private List<Long> quizIds;
}
