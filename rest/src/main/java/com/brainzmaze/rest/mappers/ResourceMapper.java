package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.ResourceDto;
import com.brainzmaze.rest.models.Course;
import com.brainzmaze.rest.models.Flashcard;
import com.brainzmaze.rest.models.Quiz;
import com.brainzmaze.rest.models.Resource;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.repositories.FlashcardRepository;
import com.brainzmaze.rest.repositories.QuizRepository;
import com.brainzmaze.rest.services.course.CourseService;
import com.brainzmaze.rest.services.flashcard.FlashcardService;
import com.brainzmaze.rest.services.quiz.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResourceMapper {

    private final CourseRepository courseRepository;
    private final FlashcardRepository flashcardRepository;
    private final QuizRepository quizRepository;

    @Autowired
    public ResourceMapper(CourseRepository courseRepository, FlashcardRepository flashcardRepository, QuizRepository quizRepository) {
        this.courseRepository = courseRepository;
        this.flashcardRepository = flashcardRepository;
        this.quizRepository = quizRepository;
    }

    public ResourceDto toDto(Resource resource) {
        ResourceDto dto = new ResourceDto();
        dto.setId(resource.getId());
        dto.setName(resource.getName());
        dto.setType(resource.getType());
        dto.setUrl(resource.getUrl());

        if (resource.getCourse() != null) {
            dto.setCourseId(resource.getCourse().getId());
        }

        if (resource.getFlashcards() != null) {
            List<Long> flashcardsIds = resource.getFlashcards()
                    .stream()
                    .map(Flashcard::getId)
                    .collect(Collectors.toList());
            dto.setFlashcardsId(flashcardsIds);
        }

        if (resource.getQuizzes() != null) {
            List<Long> quizzesIds = resource.getQuizzes()
                    .stream()
                    .map(Quiz::getId)
                    .collect(Collectors.toList());
            dto.setQuizzesId(quizzesIds);
        }
        return dto;
    }

    public Resource toModel(ResourceDto dto) {
        Resource resource = new Resource();
        resource.setId(dto.getId());
        resource.setName(dto.getName());
        resource.setType(dto.getType());
        resource.setUrl(dto.getUrl());

        if (dto.getCourseId() != null) {
            Course course = courseRepository.findById(dto.getCourseId())
                    .orElseThrow(() -> new RuntimeException("Course not found with ID: " + dto.getCourseId()));
            resource.setCourse(course);
        }

        if (dto.getFlashcardsId() != null) {
            List<Flashcard> flashcards = flashcardRepository.findAllById(dto.getFlashcardsId());
            resource.setFlashcards(flashcards);
        }

        if (dto.getQuizzesId() != null) {
            List<Quiz> quizzes = quizRepository.findAllById(dto.getQuizzesId());
            resource.setQuizzes(quizzes);
        }

        return resource;
    }
}
