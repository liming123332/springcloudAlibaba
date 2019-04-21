package com.cloud.nacos.consumer.service.impl;

import com.cloud.nacos.consumer.service.NacosProviderService;
import org.springframework.stereotype.Component;

@Component
public class NacosProviderFallBack implements NacosProviderService {
    @Override
    public String hi(String message) {
        return "网络不可用，请检查你的网络";
    }
}
