package com.xw.consumer2.controller;

import com.xw.consumer2.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return HelloRemote.hello2(name);
    }

}
