package com.learningapp.web.services;

import com.learningapp.web.dtos.StatisticDto;
import com.learningapp.web.models.Statistic;

import java.util.List;

public interface StatisticService {
    List<StatisticDto> getStatistics();
}
