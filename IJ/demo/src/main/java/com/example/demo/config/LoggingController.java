package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/log-example")
    public String logExample() {
        logger.info("INFO: This is an info message");
        logger.warn("WARN: This is a warning message");
        logger.error("ERROR: This is an error message");
        return "Check the logs for messages";
    }
}
