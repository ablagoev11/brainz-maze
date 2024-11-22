package com.learningapp.web.services;

import com.learningapp.web.dtos.Br_maze_quizDto;
import com.learningapp.web.models.Br_maze_quiz;

import java.util.List;

public interface Br_maze_quizService {
    List<Br_maze_quizDto> getAll();
}
