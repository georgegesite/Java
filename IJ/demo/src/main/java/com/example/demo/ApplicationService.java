package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ApplicationService {

    public List<String> searchUsers(String name) {
        // Implementation to search users based on the provided name
        return Arrays.asList("Harry", "Ron", name);
    }

}
