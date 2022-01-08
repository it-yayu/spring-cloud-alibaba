package com.xyy.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建ConfigClientController，从Nacos配置中心中获取配置信息
 * Data ID:nacos-config-client-dev.yaml
 * @author: zyf
 * @create: 2021-12-28 15:35
 **/
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @Value("${user.name}")
    private String username;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

    @GetMapping("/username")
    public String getUsername(){
        return username;
    }

}
