package com.brainzmaze.rest.dtos;

import com.brainzmaze.rest.models.Course;
import com.brainzmaze.rest.models.QuizResult;
import com.brainzmaze.rest.models.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
    private Long id;
    private String question;
    private String correctAnswers;
    private boolean isMultipleChoice;
    private String choices;
    private Long courseId;
    private Long resourceId;
    private List<Long> quizResultsIds;
}
