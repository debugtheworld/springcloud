package com.xw.server2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return "hello "+name+"，this is producer2 send first messge";
    }
}
