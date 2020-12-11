package com.zzz.cloud.service.impl;

import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import org.springframework.stereotype.Service;

/**
 * @author zjd
 * @date 2020/12/10
 */
@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public BackMessage getOne(Integer id) {

        BackMessage message = new BackMessage();
        message.setCode(200);
        message.setMessage("当前线程id："+Thread.currentThread().getName()+"---"+id);

        return message;
    }

    @Override
    public BackMessage getOneSleep(Integer id) {
        BackMessage message = new BackMessage();

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        message.setCode(200);
        message.setMessage("执行了3s,当前线程id："+Thread.currentThread().getName()+"---"+id);


        return message;
    }
}
