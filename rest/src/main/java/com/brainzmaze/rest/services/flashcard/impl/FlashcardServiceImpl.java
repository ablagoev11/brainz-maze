package com.brainzmaze.rest.services.flashcard.impl;

import com.brainzmaze.rest.dtos.FlashcardDto;
import com.brainzmaze.rest.mappers.FlashcardMapper;
import com.brainzmaze.rest.models.Flashcard;
import com.brainzmaze.rest.repositories.FlashcardRepository;
import com.brainzmaze.rest.services.flashcard.FlashcardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FlashcardServiceImpl implements FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final FlashcardMapper flashcardMapper;

    @Override
    public FlashcardDto createFlashcard(FlashcardDto flashcardDto) {
        Flashcard flashcard = flashcardMapper.toModel(flashcardDto);
        Flashcard savedFlashcard = flashcardRepository.save(flashcard);
        return flashcardMapper.toDto(savedFlashcard);
    }

    @Override
    public Flashcard getFlashcardById(Long id) {
        return flashcardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flashcard not found with id: " + id));
    }
    @Override
    public List<Flashcard> getFlashcardsByIds(List<Long> ids) {
        return flashcardRepository.findAllById(ids);
    }


    @Override
    public FlashcardDto getFlashcardDto(Long id) {
        Flashcard flashcard = getFlashcardById(id);
        return flashcardMapper.toDto(flashcard);
    }
}