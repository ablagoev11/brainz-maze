package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.Br_maze_flashcardDto;
import com.learningapp.web.repository.Br_maze_flashcardRepository;
import com.learningapp.web.services.Br_maze_flashcardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Br_maze_flashcardServiceImpl implements Br_maze_flashcardService {

    private Br_maze_flashcardRepository br_maze_flashcardRepository;


    public Br_maze_flashcardServiceImpl(Br_maze_flashcardRepository br_maze_flashcardRepository) {
        this.br_maze_flashcardRepository = br_maze_flashcardRepository;
    }

    @Override
    public List<Br_maze_flashcardDto> findAllFlashcards() {
        return List.of();
    }
}
