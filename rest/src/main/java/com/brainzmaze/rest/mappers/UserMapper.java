package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.UserDto;
import com.brainzmaze.rest.enums.Role;
import com.brainzmaze.rest.models.User;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.repositories.QuizResultRepository;
import com.brainzmaze.rest.repositories.SchoolRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class UserMapper {

    private final CourseRepository courseRepository;
    private final QuizResultRepository quizResultRepository;
    private final SchoolRepository schoolRepository;

    public UserMapper(CourseRepository courseRepository, QuizResultRepository quizResultRepository, SchoolRepository schoolRepository) {
        this.courseRepository = courseRepository;
        this.quizResultRepository = quizResultRepository;
        this.schoolRepository = schoolRepository;
    }

    public UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole().toString());

        if (user.getSchool() != null) {
            dto.setSchoolId(user.getSchool().getId());
        }

        List<Long> courseIds = user.getCourses()
                .stream()
                .map(course -> course.getId())
                .collect(Collectors.toList());
        dto.setCourseIds(courseIds);

        List<Long> quizResultIds = user.getQuizResults()
                .stream()
                .map(quizResult -> quizResult.getId())
                .collect(Collectors.toList());
        dto.setQuizResultIds(quizResultIds);

        return dto;
    }

    public User toModel(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());

        if (dto.getRole() != null) {
            user.setRole(Role.valueOf(dto.getRole()));
        }

        if (dto.getSchoolId() != null) {
            user.setSchool(schoolRepository.findById(dto.getSchoolId())
                    .orElseThrow(() -> new RuntimeException("School not found with ID: " + dto.getSchoolId())));
        }

        if (dto.getCourseIds() != null) {
            user.setCourses(courseRepository.findAllById(dto.getCourseIds()));
        }

        if (dto.getQuizResultIds() != null) {
            user.setQuizResults(quizResultRepository.findAllById(dto.getQuizResultIds()));
        }

        return user;
    }
}
