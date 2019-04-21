package com.cloud.nacos.consumer.service;

import com.cloud.nacos.consumer.service.impl.NacosProviderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-provider",fallback = NacosProviderFallBack.class)
public interface NacosProviderService {
    @GetMapping(value = "/provider/hi/{message}")
    public String hi(@PathVariable("message")String message);

}
