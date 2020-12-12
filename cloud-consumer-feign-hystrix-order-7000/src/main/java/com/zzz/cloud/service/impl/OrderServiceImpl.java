package com.zzz.cloud.service.impl;

import com.zzz.cloud.service.OrderService;
import entity.BackMessage;
import org.springframework.stereotype.Component;

/**
 * @Date 2020/12/11 21:43
 * @Created by zjd
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public BackMessage orderTest(Integer id) {
        BackMessage message = new BackMessage();
        message.setMessage("降级处理");
        return message;
    }
}
