package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
