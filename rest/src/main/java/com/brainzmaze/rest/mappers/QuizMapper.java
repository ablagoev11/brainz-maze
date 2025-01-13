package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.QuizDto;
import com.brainzmaze.rest.models.Course;
import com.brainzmaze.rest.models.Quiz;
import com.brainzmaze.rest.models.QuizResult;
import com.brainzmaze.rest.models.Resource;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.repositories.QuizResultRepository;
import com.brainzmaze.rest.repositories.ResourceRepository;
import com.brainzmaze.rest.services.course.CourseService;
import com.brainzmaze.rest.services.quizResults.QuizResultsService;
import com.brainzmaze.rest.services.resource.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuizMapper {

    private final CourseRepository courseRepository;
    private final ResourceRepository resourceRepository;
    private final QuizResultRepository quizResultRepository;

    @Autowired
    public QuizMapper(CourseRepository courseRepository, ResourceRepository resourceRepository, QuizResultRepository quizResultRepository) {
        this.courseRepository = courseRepository;
        this.resourceRepository = resourceRepository;
        this.quizResultRepository = quizResultRepository;
    }

    public static QuizDto toDto(Quiz quiz) {
        QuizDto dto = new QuizDto();
        dto.setId(quiz.getId());
        dto.setChoices(quiz.getChoices());
        dto.setQuestion(quiz.getQuestion());
        dto.setCorrectAnswers(quiz.getCorrectAnswers());
        dto.setMultipleChoice(quiz.isMultipleChoice());

        if (quiz.getCourse() != null) {
            dto.setCourseId(quiz.getCourse().getId());
        }

        if (quiz.getResource() != null) {
            dto.setResourceId(quiz.getResource().getId());
        }

        if (quiz.getQuizResults() != null) {
            List<Long> resultIds = quiz.getQuizResults()
                    .stream()
                    .map(QuizResult::getId)
                    .collect(Collectors.toList());
            dto.setQuizResultsIds(resultIds);
        }

        return dto;
    }

    public Quiz toModel(QuizDto dto) {
        Quiz quiz = new Quiz();
        quiz.setId(dto.getId());
        quiz.setChoices(dto.getChoices());
        quiz.setQuestion(dto.getQuestion());
        quiz.setCorrectAnswers(dto.getCorrectAnswers());
        quiz.setMultipleChoice(dto.isMultipleChoice());

        if (dto.getCourseId() != null) {
            Course course = courseRepository.findById(dto.getCourseId())
                    .orElseThrow(() -> new RuntimeException("Course not found with ID: " + dto.getCourseId()));
            quiz.setCourse(course);
        }

        if (dto.getResourceId() != null) {
            Resource resource = resourceRepository.findById(dto.getResourceId())
                    .orElseThrow(() -> new RuntimeException("Resource not found with ID: " + dto.getResourceId()));
            quiz.setResource(resource);
        }

        if (dto.getQuizResultsIds() != null) {
            List<QuizResult> quizResults = quizResultRepository.findAllById(dto.getQuizResultsIds());
            quiz.setQuizResults(quizResults);
        }

        return quiz;
    }
}
