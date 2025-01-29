package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Long> {

    Optional<School> findByDomain(String domain);
}
