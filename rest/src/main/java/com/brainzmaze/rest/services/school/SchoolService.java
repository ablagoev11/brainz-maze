package com.brainzmaze.rest.services.school;

import com.brainzmaze.rest.dtos.SchoolDto;

import java.util.Optional;

public interface SchoolService {

    // Method to create a school
    SchoolDto createSchool(SchoolDto schoolDto);

    // Method to get a school by domain
    Optional<SchoolDto> getSchoolByDomain(String domain);
}