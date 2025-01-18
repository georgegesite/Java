package com.example.demo;

import com.example.demo.config.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/index")
public class ApplicationController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

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

    // Call this using - http://localhost:8081/index/users/send
    @PostMapping("/users/send")
    public void getResponseData (@RequestBody String request){
        logger.info(request);
    }


    // Beans
    // Declare Class in constructor
    // Spring is gonna use this constuctor as a way identify which dependencies are needed and then inject them.
}
