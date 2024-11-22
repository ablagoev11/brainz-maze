package com.learningapp.web.services;

import com.learningapp.web.dtos.Br_maze_flashcardDto;

import java.util.List;

public interface Br_maze_flashcardService {
    List<Br_maze_flashcardDto> findAllFlashcards();

}
