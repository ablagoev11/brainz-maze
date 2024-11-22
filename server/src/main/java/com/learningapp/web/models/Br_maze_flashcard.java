package com.learningapp.web.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "br_maze_flashcards")
public class Br_maze_flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
