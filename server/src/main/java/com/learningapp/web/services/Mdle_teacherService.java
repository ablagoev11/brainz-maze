package com.learningapp.web.services;

import com.learningapp.web.dtos.Mdle_teacherDto;
import com.learningapp.web.models.Mdle_teacher;

import java.util.List;

public interface Mdle_teacherService {
    List<Mdle_teacherDto> getAllTeachers();
}
