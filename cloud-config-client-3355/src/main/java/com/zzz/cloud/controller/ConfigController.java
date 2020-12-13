package com.zzz.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/13 16:09
 * @Created by zjd
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${config}")
    private String version;

    @GetMapping("/getConfig")
    public String getConfig(){
        return version;
    }
}
