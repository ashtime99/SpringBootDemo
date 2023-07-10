package com.ashtime99.logdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiayichao
 * @version 1.0
 */
@Slf4j
@RequestMapping("/log")
@RestController
public class LogDemoController {

    @GetMapping("/hello")
    public String sayHello() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "hello";
    }

    @GetMapping("/error")
    public Integer errorTest() {
        return 1 / 0;
    }
}
