package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.Mdle_studentDto;
import com.learningapp.web.repository.Mdle_courseRepository;
import com.learningapp.web.repository.Mdle_studentRepository;
import com.learningapp.web.services.Mdle_studentService;

import java.util.List;

public class Mdle_studentServiceImpl implements Mdle_studentService {

    private Mdle_studentRepository mdle_studentRepository;

    public Mdle_studentServiceImpl(Mdle_studentRepository mdle_studentRepository) {
        this.mdle_studentRepository = mdle_studentRepository;
    }

    @Override
    public List<Mdle_studentDto> getAllStudents() {
        return List.of();
    }
}
