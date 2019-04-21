package com.cloud.nacos.consumer.controller;

import com.cloud.nacos.consumer.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class NacosConsumerController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping("/hi/{message}")
    public String hi(@PathVariable("message")String message){
        System.out.println("aaaaa");
        return nacosProviderService.hi(message);
    }
}
