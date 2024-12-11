package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.FlashcardDto;
import com.brainzmaze.rest.models.Flashcard;

public class FlashcardMapper {
    public static FlashcardDto toDto(Flashcard flashcard) {
        FlashcardDto dto = new FlashcardDto();
        dto.setId(flashcard.getId());
        dto.setAnswer(flashcard.getAnswer());
        dto.setQuestion(flashcard.getQuestion());
        return dto;
    }

    public static Flashcard toModel(FlashcardDto dto) {
        Flashcard flashcard = new Flashcard();
        flashcard.setId(dto.getId());
        flashcard.setAnswer(dto.getAnswer());
        flashcard.setQuestion(dto.getQuestion());
        return flashcard;
    }
}
