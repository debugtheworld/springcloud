package com.xw.server.contoller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return "hello "+name+"，this is producer send first messge";
    }
}
