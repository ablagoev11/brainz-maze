package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.SchoolDto;
import com.brainzmaze.rest.models.School;
import com.brainzmaze.rest.models.User;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
@Component
public class SchoolMapper {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public SchoolDto toDto(School school) {
        SchoolDto dto = new SchoolDto();
        dto.setId(school.getId());
        dto.setName(school.getName());
        dto.setDomain(school.getDomain());
        dto.setDescription(school.getDescription());

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
