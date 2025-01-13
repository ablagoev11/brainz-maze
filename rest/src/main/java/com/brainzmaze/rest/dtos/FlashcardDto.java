package com.brainzmaze.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlashcardDto {
    private Long id;
    private String question;
    private String answer;
    private Long courseId;
    private Long resourceId;

}
