package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.QuizResultDto;
import com.brainzmaze.rest.models.Quiz;
import com.brainzmaze.rest.models.QuizResult;
import com.brainzmaze.rest.models.User;
import com.brainzmaze.rest.repositories.QuizRepository;
import com.brainzmaze.rest.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@Component
public class QuizResultMapper {

    private final QuizRepository quizRepository;
    private final UserRepository userRepository;


    public QuizResultDto toDto(QuizResult quizResult) {
        QuizResultDto dto = new QuizResultDto();
        dto.setId(quizResult.getId());
        dto.setScore(quizResult.getScore());
        dto.setAttemptedOn(quizResult.getAttemptedOn());

        if (quizResult.getQuiz() != null) {
            dto.setQuizId(quizResult.getQuiz().getId());
        }
        if (quizResult.getUser() != null) {
            dto.setUserId(quizResult.getUser().getId());
        }
        return dto;
    }

    public QuizResult toModel(QuizResultDto dto) {
        QuizResult quizResult = new QuizResult();
        quizResult.setId(dto.getId());
        quizResult.setScore(dto.getScore());
        quizResult.setAttemptedOn(dto.getAttemptedOn());

        if (dto.getQuizId() != null) {
            Quiz quiz = quizRepository.findById(dto.getQuizId())
                    .orElseThrow(() -> new RuntimeException("Quiz not found with ID: " + dto.getQuizId()));
            quizResult.setQuiz(quiz);
        }

        if (dto.getUserId() != null) {
            User user = userRepository.findById(dto.getUserId())
                    .orElseThrow(() -> new RuntimeException("User not found with ID: " + dto.getUserId()));
            quizResult.setUser(user);
        }

        return quizResult;
    }
}


