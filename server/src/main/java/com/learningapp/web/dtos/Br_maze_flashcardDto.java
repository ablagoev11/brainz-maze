package com.learningapp.web.dtos;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Br_maze_flashcardDto {

    private Long id;

    @Column(name = "resource_id")
    private Integer resourceId;

    @ElementCollection
    @CollectionTable(name = "flashcard_questions", joinColumns = @JoinColumn(name = "flashcard_id"))
    @Column(name = "question")
    private List<String> questions;

    @ElementCollection
    @CollectionTable(name = "flashcard_answers", joinColumns = @JoinColumn(name = "flashcard_id"))
    @Column(name = "answer")
    private List<String> answers;
}
