package com.xw.consumer2.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


//name:远程服务名，及spring.application.name配置的名称
//此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
// 上面的话有错误，方法名无需一致性，但参数需一致,包括参数形式，
// 如果远程服务用的是pathvariable这边也需要用pathvariable
@FeignClient(name= "spring-cloud-producer2",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello/{name}")
    public String hello2(@PathVariable(value = "name") String name);
}
