package com.brainzmaze.rest.repositories;

import com.brainzmaze.rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
