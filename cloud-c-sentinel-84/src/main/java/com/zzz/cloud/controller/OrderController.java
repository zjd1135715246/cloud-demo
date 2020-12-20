package com.zzz.cloud.controller;

import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjd
 * @Date 2020/12/20 11:30
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private String URL = "http://nacos-payment-provider";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") Integer id){
        Object object = restTemplate.getForObject(URL+"/pay/"+id, BackMessage.class);
        return object.toString();
    }
}
