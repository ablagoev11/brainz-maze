package com.brainzmaze.rest.services.moodle;

import java.util.Map;
import java.util.Objects;

public interface MoodleService {
    Map<String, Object> getUsers(String key, String value);
}
