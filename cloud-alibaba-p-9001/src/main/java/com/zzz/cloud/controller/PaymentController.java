package com.zzz.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/15 20:37
 * @Created by zjd
 */
@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort(){
        return "当前端口："+port;
    }
}
