package com.zzz.cloud.controller;

import com.alibaba.fastjson.JSON;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
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



    @GetMapping("/getOne")
    public BackMessage getOnePayment(Integer id){
        BackMessage<?> message = RestUtils.getForEntity("http://localhost:7001/pay/payment?id=" + id, BackMessage.class);
        return message;
    }
}
