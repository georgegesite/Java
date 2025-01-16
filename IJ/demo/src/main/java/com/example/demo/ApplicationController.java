package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
@RequestMapping("/index")
@RestController
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    // Call this using - http://localhost:8081/index/search?name=Alex
    @GetMapping("/search")
    public ResponseEntity<List<String>> searchUsers(@RequestParam("name") String name) {
        // Implementation to search users based on the provided name
        return ResponseEntity.ok(applicationService.searchUsers(name));
    }

    // Call this using - http://localhost:8081/index/users/{userId}
    @GetMapping("/users/{userId}")
    public ResponseEntity<String> getUserDetails(@PathVariable Long userId) {
        // Implementation to fetch user details based on the provided userId
        String userDetails = "User details for user ID: " + userId;
        return ResponseEntity.ok(userDetails);
    }
}
