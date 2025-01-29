package com.brainzmaze.rest.controllers;

import com.brainzmaze.rest.dtos.SchoolDto;
import com.brainzmaze.rest.services.school.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {


    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    private final SchoolService schoolService;

    // Endpoint to create a new school
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SchoolDto createSchool(@RequestBody SchoolDto schoolDto) {
        return schoolService.createSchool(schoolDto);
    }

    // Endpoint to get a school by its domain
    @GetMapping("/domain/{domain}")
    public SchoolDto getSchoolByDomain(@PathVariable String domain) {
        return schoolService.getSchoolByDomain(domain)
                .orElseThrow(() -> new RuntimeException("School not found with domain: " + domain));
    }

}