package com.zzz.cloud.controller;

import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjd
 * @date 2020/12/10
 */
@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/pay/ok")
    public BackMessage getOne(Integer id){
        BackMessage message = paymentService.getOne(id);
        return message;
    }

    @GetMapping("/pay/sleep")
    public BackMessage getOneSleep(Integer id){
        BackMessage message = paymentService.getOneSleep(id);
        return message;
    }
}
