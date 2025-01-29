package com.brainzmaze.rest.services.school.impl;

import com.brainzmaze.rest.dtos.SchoolDto;
import com.brainzmaze.rest.mappers.SchoolMapper;
import com.brainzmaze.rest.models.School;
import com.brainzmaze.rest.repositories.SchoolRepository;
import com.brainzmaze.rest.services.school.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    @Override
    public SchoolDto createSchool(SchoolDto schoolDto) {
        School school = schoolMapper.toModel(schoolDto);
        school = schoolRepository.save(school);
        return schoolMapper.toDto(school);
    }

    @Override
    public Optional<SchoolDto> getSchoolByDomain(String domain) {
        Optional<School> school = schoolRepository.findByDomain(domain);
        return school.map(schoolMapper::toDto);  // Convert the School entity to SchoolDto
    }
}