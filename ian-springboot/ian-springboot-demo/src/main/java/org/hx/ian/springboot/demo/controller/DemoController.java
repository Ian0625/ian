package org.hx.ian.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Author hx 2018/11/5
 * @Description demo api
 * @Date 2018/11/5 15:48
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${app}")
    private String main;

    @Value("${server}")
    private String server;

    @Value("${demo}")
    private String demo;

    @RequestMapping(value = "/string")
    public String getString() {
        String result = main + server + demo;
        return result;
    }
}