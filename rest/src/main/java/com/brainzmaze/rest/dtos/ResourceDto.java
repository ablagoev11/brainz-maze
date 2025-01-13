package com.brainzmaze.rest.dtos;

import com.brainzmaze.rest.models.Course;
import com.brainzmaze.rest.models.Flashcard;
import com.brainzmaze.rest.models.Quiz;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResourceDto {
    private Long id;
    private String name;
    private String type;
    private String url;
    private Long courseId;
    private List<Long> flashcardsId;
    private List<Long> quizzesId;

}
