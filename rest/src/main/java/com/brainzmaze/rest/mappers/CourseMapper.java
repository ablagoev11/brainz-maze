package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.CourseDto;
import com.brainzmaze.rest.models.Course;

public class CourseMapper {
    public static CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setDescription(course.getDescription());
        dto.setTitle(course.getTitle());
        return dto;
    }
    public static Course toModel(CourseDto dto) {
        Course course = new Course();
        course.setId(dto.getId());
        course.setDescription(dto.getDescription());
        course.setTitle(dto.getTitle());
        return course;
    }
}
