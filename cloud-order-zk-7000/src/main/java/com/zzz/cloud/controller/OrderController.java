package com.zzz.cloud.controller;

import com.alibaba.fastjson.JSON;
import com.zzz.cloud.config.RestTemplateConfig;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Date 2020/12/9 19:16
 * @Created by zjd
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static  String URL = "http://cloud-p-svr";

    @GetMapping("/get")
    public BackMessage get(Integer id){
        BackMessage message = JSON.parseObject(JSON.toJSONString(restTemplate.getForObject(URL + "/pay/payment?id=" + id, Object.class)),BackMessage.class);
        return message;
    }
}
