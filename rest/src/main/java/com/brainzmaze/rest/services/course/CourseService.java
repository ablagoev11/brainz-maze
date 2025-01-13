package com.brainzmaze.rest.services.course;

import com.brainzmaze.rest.dtos.CourseDto;
import com.brainzmaze.rest.models.Course;

import java.util.List;

public interface CourseService {
    Course getCourseById(Long id);
    CourseDto createCourse(CourseDto courseDto);
    List<Course> getCoursesByIds(List<Long> ids);
    CourseDto getCourseDto(Long id);
}
