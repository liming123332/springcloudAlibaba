package com.cloud.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("provider")
public class NacosProviderController {
    @Value("${server.port}")
    String port;
    @GetMapping(value = "/hi/{message}")
    public String hi(@PathVariable(value = "message")String message){
        return "hello"+message+"\t"+port;
    }
}
