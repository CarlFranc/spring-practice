package com.personal.MyApplication.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    Logger logger = LoggerFactory.getLogger(GreetingsController.class);

    @GetMapping("/")
    public String greetings() {
        logger.info("GreetingsController here");
        return "Hello World!";
    }
    @GetMapping("/sayHello")
    public String sayHello() {
        logger.info("GreetingsController sayHello");
        return "Hello World";
    }
}
