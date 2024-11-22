package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.Mdle_teacherDto;
import com.learningapp.web.services.Mdle_teacherService;

import java.util.List;

public class Mdle_teacherServiceImpl implements Mdle_teacherService {

    private Mdle_teacherService mdle_teacherService;

    public Mdle_teacherServiceImpl(Mdle_teacherService mdle_teacherService) {
        this.mdle_teacherService = mdle_teacherService;
    }

    @Override
    public List<Mdle_teacherDto> getAllTeachers() {
        return List.of();
    }
}
