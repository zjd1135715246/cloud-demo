package com.zzz.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.cloud.service.OrderService;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/11 21:11
 * @Created by zjd
 */
@RequestMapping("/order")
@RestController
@DefaultProperties(defaultFallback = "order_global_fall_back")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/get/hys/{id}")
//    @HystrixCommand(fallbackMethod = "getOneSleepHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "4000")
//    })
    @HystrixCommand
    public BackMessage getOneSleep(@PathVariable("id") Integer id) {
        BackMessage message = new BackMessage();
        //int x = 10/0;
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        orderService.orderTest(id);
        message.setCode(200);
        message.setMessage("执行了3s,当前线程id："+Thread.currentThread().getName()+"---"+id);
        return message;
    }

    public BackMessage getOneSleepHandler(Integer id) {
        BackMessage message = new BackMessage();
        message.setCode(400);
        message.setMessage("80消费端或客户端有问题，自己降级了");
        return message;
    }

    public BackMessage order_global_fall_back() {
        BackMessage message = new BackMessage();
        message.setCode(400);
        message.setMessage("全局降级处理位置");
        return message;
    }

}
