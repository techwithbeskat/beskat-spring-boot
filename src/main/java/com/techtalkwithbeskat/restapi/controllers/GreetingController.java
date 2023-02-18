package com.techtalkwithbeskat.restapi.controllers;

import com.techtalkwithbeskat.dao.GreetDao;
import com.techtalkwithbeskat.dao.HelloDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    public ResponseEntity<HelloDao> hello() {
        return new ResponseEntity<>(new HelloDao(), HttpStatus.OK);
    }

    @PostMapping("/greet")
    public ResponseEntity<GreetDao> greet(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        return new ResponseEntity<>(new GreetDao(name), HttpStatus.CREATED);
    }
}

