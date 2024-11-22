package com.learningapp.web.services.impl;

import com.learningapp.web.dtos.Br_maze_quizDto;
import com.learningapp.web.repository.Br_maze_quizRepository;
import com.learningapp.web.services.Br_maze_quizService;

import java.util.List;

public class Br_maze_quizServiceImpl implements Br_maze_quizService {

    private Br_maze_quizRepository br_maze_quizRepository;

    public Br_maze_quizServiceImpl(Br_maze_quizRepository br_maze_quizRepository) {
        this.br_maze_quizRepository = br_maze_quizRepository;
    }

    @Override
    public List<Br_maze_quizDto> getAll() {
        return List.of();
    }
}
