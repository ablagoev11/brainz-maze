package com.learningapp.web.services;

import com.learningapp.web.dtos.Mdle_courseDto;
import com.learningapp.web.models.Mdle_course;

import java.util.List;

public interface Mdle_courseService {
    List<Mdle_courseDto> getAllCourses();
}
