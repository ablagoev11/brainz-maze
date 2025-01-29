package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.CourseDto;
import com.brainzmaze.rest.models.*;
import com.brainzmaze.rest.repositories.*;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
@Component
public class CourseMapper {
    private final UserRepository userRepository;
    private final SchoolRepository schoolRepository;
    private final ResourceRepository resourceRepository;
    private final FlashcardRepository flashcardRepository;
    private final QuizRepository quizRepository;

    public CourseMapper(UserRepository userRepository, SchoolRepository schoolRepository, ResourceRepository resourceRepository, FlashcardRepository flashcardRepository, QuizRepository quizRepository) {
        this.userRepository = userRepository;
        this.schoolRepository = schoolRepository;
        this.resourceRepository = resourceRepository;
        this.flashcardRepository = flashcardRepository;
        this.quizRepository = quizRepository;
    }

    public CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setDescription(course.getDescription());
        dto.setTitle(course.getTitle());

        if (course.getSchool() != null) {
            dto.setSchoolId(course.getSchool().getId());
        }

        List<Long> userIds = course.getUsers()
                .stream()
                .map(User::getId)
                .collect(Collectors.toList());
        dto.setUserIds(userIds);

        dto.setResourceIds(
                course.getResources().stream().map(Resource::getId).collect(Collectors.toList())
        );

        dto.setFlashcardIds(
                course.getFlashcards().stream().map(flashcard -> flashcard.getId()).collect(Collectors.toList())
        );

        dto.setQuizIds(
                course.getQuizzes().stream().map(quiz -> quiz.getId()).collect(Collectors.toList())
        );

        return dto;
    }

    public Course toModel(CourseDto dto) {
        Course course = new Course();
        course.setId(dto.getId());
        course.setDescription(dto.getDescription());
        course.setTitle(dto.getTitle());

        if (dto.getSchoolId() != null) {
            Optional<School> school = schoolRepository.findById(dto.getSchoolId());
            school.ifPresent(course::setSchool);
        }

        if (dto.getUserIds() != null) {
            Set<User> users = new HashSet<>(userRepository.findAllById(dto.getUserIds()));
            course.setUsers(users);
        }

        if (dto.getResourceIds() != null) {
            Set<Resource> resources = new HashSet<>(resourceRepository.findAllById(dto.getResourceIds()));
            course.setResources(resources);
        }

        if (dto.getFlashcardIds() != null) {
            List<Flashcard> flashcards = flashcardRepository.findAllById(dto.getFlashcardIds());
            course.setFlashcards(flashcards);
        }

        if (dto.getQuizIds() != null) {
            List<Quiz> quizzes = quizRepository.findAllById(dto.getQuizIds());
            course.setQuizzes(quizzes);
        }

        return course;
    }

}
