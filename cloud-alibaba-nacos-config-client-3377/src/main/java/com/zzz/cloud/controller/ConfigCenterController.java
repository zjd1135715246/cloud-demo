package com.zzz.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/15 21:25
 * @Created by zjd
 */
@RestController
@RefreshScope
public class ConfigCenterController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public String getInfo(){
        return info;
    }
}
