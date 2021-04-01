package com.dccorp.nativeapps.controller;

import com.dccorp.nativeapps.domain.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AppController {

    @Autowired
    StreamBridge streamBridge;

    @PostMapping("/person")
    public void create(@RequestBody Person person) {
        log.info("***** getting ready to send: {} *****", person);
        streamBridge.send("produce-out-0", person);
        log.info("***** finished sending *****");
    }
}
