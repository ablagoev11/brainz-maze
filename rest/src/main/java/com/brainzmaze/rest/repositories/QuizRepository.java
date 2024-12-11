package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
