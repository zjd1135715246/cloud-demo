package com.zzz.cloud.controller;

import com.zzz.cloud.service.PaymentFeignService;
import entity.BackMessage;
import entity.Payment;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/9 21:13
 * @Created by zjd
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/pay/get/{id}")
    public BackMessage get(@PathVariable("id") Integer id){
        BackMessage m = paymentFeignService.getPaymentById(id);
        return m;
    }
}
