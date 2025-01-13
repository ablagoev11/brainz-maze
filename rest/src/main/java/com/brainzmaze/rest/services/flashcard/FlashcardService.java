package com.brainzmaze.rest.services.flashcard;

import com.brainzmaze.rest.dtos.FlashcardDto;
import com.brainzmaze.rest.models.Flashcard;

import java.util.List;

public interface FlashcardService {
    FlashcardDto createFlashcard(FlashcardDto flashcardDto);
    Flashcard getFlashcardById(Long id);
    FlashcardDto getFlashcardDto(Long id);
    List<Flashcard> getFlashcardsByIds(List<Long> ids);


}
