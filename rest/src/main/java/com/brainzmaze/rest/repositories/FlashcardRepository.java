package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {
}
