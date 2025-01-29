package com.brainzmaze.rest.services.quizResults.impl;

import com.brainzmaze.rest.dtos.QuizResultDto;
import com.brainzmaze.rest.mappers.QuizResultMapper;
import com.brainzmaze.rest.models.QuizResult;
import com.brainzmaze.rest.repositories.QuizResultRepository;
import com.brainzmaze.rest.services.quizResults.QuizResultsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizResultsServiceImpl implements QuizResultsService {

    private final QuizResultRepository quizResultsRepository;
    private final QuizResultMapper quizResultsMapper;

    @Override
    public QuizResultDto createQuizResults(QuizResultDto quizResultsDto) {
        QuizResult quizResults = quizResultsMapper.toModel(quizResultsDto);
        QuizResult savedQuizResults = quizResultsRepository.save(quizResults);
        return quizResultsMapper.toDto(savedQuizResults);
    }

    public QuizResultsServiceImpl(QuizResultRepository quizResultsRepository, QuizResultMapper quizResultsMapper) {
        this.quizResultsRepository = quizResultsRepository;
        this.quizResultsMapper = quizResultsMapper;
    }

    @Override
    public QuizResult getQuizResultsById(Long id) {
        return quizResultsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("QuizResults not found with id: " + id));
    }
    @Override
    public List<QuizResult> getQuizResultsByIds(List<Long> ids) {
        List<QuizResult> quizResults = quizResultsRepository.findAllById(ids);

        if (quizResults.size() != ids.size()) {
            throw new RuntimeException("Some QuizResults not found for the provided IDs.");
        }

        return quizResults;
    }

    @Override
    public QuizResultDto getQuizResultsDto(Long id) {
        QuizResult quizResults = getQuizResultsById(id);
        return quizResultsMapper.toDto(quizResults);
    }
}