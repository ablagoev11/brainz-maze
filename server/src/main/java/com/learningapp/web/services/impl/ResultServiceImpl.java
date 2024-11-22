package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.ResultDto;
import com.learningapp.web.services.ResultService;

import java.util.List;

public class ResultServiceImpl implements ResultService {

    private ResultService resultService;

    public ResultServiceImpl(ResultService resultService) {
        this.resultService = resultService;
    }

    @Override
    public List<ResultDto> getAllResults() {
        return List.of();
    }
}
