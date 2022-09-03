package com.abhi.docker_jenkins_integration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/person")
public class PersonController {
    @GetMapping("/message")
    public ResponseEntity getMessage() {
        return ResponseEntity.ok("Hello, Its Abhishek....!!");
    }
}