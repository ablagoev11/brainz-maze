package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.SchoolDto;
import com.brainzmaze.rest.models.School;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class SchoolMapper {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public SchoolMapper(CourseRepository courseRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    public SchoolDto toDto(School school) {
        SchoolDto dto = new SchoolDto();
        dto.setId(school.getId());
        dto.setName(school.getName());
        dto.setDomain(school.getDomain());
        dto.setDescription(school.getDescription());
        dto.setMoodleToken(school.getMoodleToken());

        List<Long> courseIds = school.getCourses()
                .stream()
                .map(course -> course.getId())
                .collect(Collectors.toList());
        dto.setCoursesId(courseIds);

        List<Long> userIds = school.getUsers()
                .stream()
                .map(user -> user.getId())
                .collect(Collectors.toList());
        dto.setUsersId(userIds);

        return dto;
    }

    public School toModel(SchoolDto dto) {
        School school = new School();
        school.setId(dto.getId());
        school.setName(dto.getName());
        school.setDomain(dto.getDomain());
        school.setDescription(dto.getDescription());

        if (dto.getCoursesId() != null) {
            school.setCourses(courseRepository.findAllById(dto.getCoursesId()));
        }

        if (dto.getUsersId() != null) {
            school.setUsers(userRepository.findAllById(dto.getUsersId()));
        }

        return school;
    }
}
