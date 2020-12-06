package com.zzz.cloud.controller;

import com.zzz.cloud.entity.BackMessage;
import com.zzz.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/12/6 17:05
 * @Created by zjd
 */
@RestController
@RequestMapping("pay")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public BackMessage getPayment(Integer id){

        return null;
    }
}
