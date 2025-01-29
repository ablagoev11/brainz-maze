package com.brainzmaze.rest.services.user.impl;

import com.brainzmaze.rest.models.School;
import com.brainzmaze.rest.models.User;
import com.brainzmaze.rest.repositories.SchoolRepository;
import com.brainzmaze.rest.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final SchoolRepository schoolRepository;



    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, SchoolRepository schoolRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.schoolRepository = schoolRepository;
    }

    public User createUserFromMoodle(Long userId, String firstName, String lastName, String email, Long schoolId) {


        Optional<User> existingUser = userRepository.findById(userId);

        if (existingUser.isPresent()) {
            return existingUser.get();
        }

        Optional<School> existingSchool = schoolRepository.findById(schoolId);
        if (!existingSchool.isPresent()) {
            return null;
        }

        User user = new User();
        user.setId(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setSchool(existingSchool.get());
        user.setConfirmed(false);

        return userRepository.save(user);
    }
}
