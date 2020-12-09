package com.zzz.cloud.controller;

import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/9 19:23
 * @Created by zjd
 */
@RequestMapping("/pay")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public BackMessage getPayment(Integer id){
        BackMessage message = paymentService.getPayment(id);
        return message;
    }
}
