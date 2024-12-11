package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
