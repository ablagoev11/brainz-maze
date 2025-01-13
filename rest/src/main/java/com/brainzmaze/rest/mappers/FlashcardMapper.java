package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.FlashcardDto;
import com.brainzmaze.rest.models.Flashcard;
import com.brainzmaze.rest.models.Course;
import com.brainzmaze.rest.models.Resource;
import com.brainzmaze.rest.repositories.CourseRepository;
import com.brainzmaze.rest.repositories.ResourceRepository;
import com.brainzmaze.rest.services.course.CourseService;
import com.brainzmaze.rest.services.resource.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlashcardMapper {

    private final CourseRepository courseRepository;
    private final ResourceRepository resourceRepository;

    @Autowired
    public FlashcardMapper(CourseRepository courseRepository, ResourceRepository resourceRepository) {
        this.courseRepository = courseRepository;
        this.resourceRepository = resourceRepository;
    }

    public FlashcardDto toDto(Flashcard flashcard) {
        FlashcardDto dto = new FlashcardDto();
        dto.setId(flashcard.getId());
        dto.setAnswer(flashcard.getAnswer());
        dto.setQuestion(flashcard.getQuestion());

        if (flashcard.getCourse() != null) {
            dto.setCourseId(flashcard.getCourse().getId());
        }

        if (flashcard.getResource() != null) {
            dto.setResourceId(flashcard.getResource().getId());
        }

        return dto;
    }

    public Flashcard toModel(FlashcardDto dto) {
        Flashcard flashcard = new Flashcard();
        flashcard.setId(dto.getId());
        flashcard.setAnswer(dto.getAnswer());
        flashcard.setQuestion(dto.getQuestion());

        if (dto.getCourseId() != null) {
            Course course = courseRepository.findById(dto.getCourseId())
                    .orElseThrow(() -> new RuntimeException("Course not found with ID: " + dto.getCourseId()));
            flashcard.setCourse(course);
        }

        if (dto.getResourceId() != null) {
            Resource resource = resourceRepository.findById(dto.getResourceId())
                    .orElseThrow(() -> new RuntimeException("Resource not found with ID: " + dto.getResourceId()));
            flashcard.setResource(resource);
        }

        return flashcard;
    }
}
