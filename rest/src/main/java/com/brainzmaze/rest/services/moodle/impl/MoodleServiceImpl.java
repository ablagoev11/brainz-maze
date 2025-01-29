package com.brainzmaze.rest.services.moodle.impl;

import com.brainzmaze.rest.repositories.UserRepository;
import org.springframework.web.client.RestTemplate;

public class MoodleServiceImpl {
    public MoodleServiceImpl(UserRepository userRepository, RestTemplate restTemplate) {
        this.userRepository = userRepository;
        this.restTemplate = restTemplate;
    }

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    private static final String MOODLE_BASE_URL = "http://localhost/moodle/webservice/rest/server.php";
    private static final String MOODLE_TOKEN = "1e8c977d0407ebf3a22c454ddfcfb106";
}
