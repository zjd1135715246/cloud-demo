package com.zzz.cloud.controller;

import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@RestController
@RequestMapping("pay")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment")
    public BackMessage getPayment(Integer id){
        BackMessage message = paymentService.getPayment(id);
        return message;
    }

    @GetMapping("/discovery")
    public Object discovery(){

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-P-SVR");
        for (ServiceInstance s:
                instances) {
            System.out.println(instances);
        }

        List<String> services = discoveryClient.getServices();
        return services;
    }

    @GetMapping("/batch")
    public void test(){
        paymentService.test();
    }
}
