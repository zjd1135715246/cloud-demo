package com.zzz.cloud.controller;

import com.zzz.cloud.entity.BackMessage;
import com.zzz.cloud.entity.Order;
import com.zzz.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjd
 * @Date 2020/12/20 19:47
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/createOrder")
    public BackMessage createOrder(Order order){
        orderService.createOrder(order);
        return new BackMessage();
    }
}
