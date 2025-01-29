package com.brainzmaze.rest.services.course.impl;

import com.brainzmaze.rest.dtos.CourseDto;
import com.brainzmaze.rest.mappers.CourseMapper;
import com.brainzmaze.rest.models.Course;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.services.course.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    public CourseDto createCourse(CourseDto courseDto) {
        Course course = courseMapper.toModel(courseDto);
        Course savedCourse = courseRepository.save(course);
        return courseMapper.toDto(savedCourse);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }

    public CourseServiceImpl(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    @Override
    public List<Course> getCoursesByIds(List<Long> ids) {
        return courseRepository.findAllById(ids);
    }

    @Override
    public CourseDto getCourseDto(Long id) {
        Course course = getCourseById(id);
        return courseMapper.toDto(course);
    }
}
