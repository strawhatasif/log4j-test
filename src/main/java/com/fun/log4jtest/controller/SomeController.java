package com.fun.log4jtest.controller;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    private static Logger logger = (Logger) LogManager.getLogger(SomeController.class.getName());

    @GetMapping("/somebody")
    public String getSomebody(@RequestHeader("user-agent") String userAgent) {
        logger.info("User agent:{} " + userAgent);

        return "I want to be somebody! My user agent is: " + userAgent;
    }

}
