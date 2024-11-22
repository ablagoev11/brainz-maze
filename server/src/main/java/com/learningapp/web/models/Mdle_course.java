package com.learningapp.web.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mdl_courses")
public class Mdle_course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TO DO: private static resources[];
    //TO DO: private static br_maze_flashcards_id[];
    //TO DO: private static br_maze_quiz_id[];

}
