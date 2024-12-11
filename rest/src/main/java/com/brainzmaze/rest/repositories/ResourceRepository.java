package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
