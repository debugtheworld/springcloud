package com.xw.configclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }

    //手动修改neo-config-dev.properties中配置信息为：neo.hello=hello im dev update2提交到github,
    // 再次在浏览器访问http://localhost:8002/hello，
    // 返回：neo.hello: hello im dev update，说明获取的信息还是旧的参数，
    // 这是为什么呢？因为spirngboot项目只有在启动的时候才会获取配置文件的值，修改github信息后，client端并没有在次去获取，所以导致这个问题。
    //加上@RefreshScope该问题可以解决
}
