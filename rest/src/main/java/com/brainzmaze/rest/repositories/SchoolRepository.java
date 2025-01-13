package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
