package com.cloud.traceclient1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * All copyright by Liuyajun.
 * <p>
 * Created by MDMORY on 2017/11/10
 * </p>
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private RestTemplate restTemplate;

    @Autowired
    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/hello")
    public String hello() {
        logger.info("Calling trace-client-1");
        return restTemplate.getForObject("http://localhost:8989/call", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        logger.info("Calling trace-client-1");
        return "This is trace-client-1";
    }
}
