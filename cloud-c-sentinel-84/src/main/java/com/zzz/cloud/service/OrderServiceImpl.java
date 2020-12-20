package com.zzz.cloud.service;

import entity.BackMessage;
import entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zjd
 * @Date 2020/12/20 11:52
 */
@Component
public class OrderServiceImpl implements OrderService{


    @Override
    public BackMessage pay(Integer id) {
        return new BackMessage<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(Long.valueOf(id),"errorSerial"));
    }
}
