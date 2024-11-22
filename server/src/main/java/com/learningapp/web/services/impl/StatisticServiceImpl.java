package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.StatisticDto;
import com.learningapp.web.repository.StatisticRepository;
import com.learningapp.web.services.StatisticService;

import java.util.List;

public class StatisticServiceImpl implements StatisticService {

    private StatisticRepository statisticRepository;

    public StatisticServiceImpl(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    @Override
    public List<StatisticDto> getStatistics() {
        return List.of();
    }
}
