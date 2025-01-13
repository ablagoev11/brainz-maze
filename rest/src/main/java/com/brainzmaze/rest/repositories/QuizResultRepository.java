package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
}
