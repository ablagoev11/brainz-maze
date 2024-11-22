package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.Mdle_courseDto;
import com.learningapp.web.repository.Mdle_courseRepository;
import com.learningapp.web.services.Mdle_courseService;

import java.util.List;

public class Mdle_courseServiceImpl implements Mdle_courseService {

    private Mdle_courseRepository mdle_courseRepository;

    public Mdle_courseServiceImpl(Mdle_courseRepository mdle_courseRepository) {
        this.mdle_courseRepository = mdle_courseRepository;
    }

    @Override
    public List<Mdle_courseDto> getAllCourses() {
        return List.of();
    }
}
