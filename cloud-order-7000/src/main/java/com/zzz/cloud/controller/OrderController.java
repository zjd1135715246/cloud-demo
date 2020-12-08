package com.zzz.cloud.controller;

import com.alibaba.fastjson.JSON;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import utils.RestUtils;

/**
 * @author zjd
 * @date 2020/12/7
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private String PROVIDE_URL = "http://CLOUD-P-SVR";

    @GetMapping("/getOne")
    public BackMessage getOnePayment(Integer id){
        BackMessage message = JSON.parseObject(JSON.toJSONString(restTemplate.getForObject(PROVIDE_URL + "/pay/payment?id=" + id, Object.class)),BackMessage.class);
        return message;
    }
}
