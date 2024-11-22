package com.learningapp.web.services;

import com.learningapp.web.dtos.Mdle_studentDto;
import com.learningapp.web.models.Mdle_student;

import java.util.List;

public interface Mdle_studentService {
    List<Mdle_studentDto> getAllStudents();
}
