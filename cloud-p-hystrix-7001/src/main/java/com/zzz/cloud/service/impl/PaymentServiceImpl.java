package com.zzz.cloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    @HystrixCommand(fallbackMethod = "getOneSleepHandler",commandProperties = {
       @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public BackMessage getOneSleep(Integer id) {
        BackMessage message = new BackMessage();
        int x = 10/0;
        /*try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        message.setCode(200);
        message.setMessage("执行了3s,当前线程id："+Thread.currentThread().getName()+"---"+id);


        return message;
    }

    public BackMessage getOneSleepHandler(Integer id) {
        BackMessage message = new BackMessage();
        message.setCode(400);
        message.setMessage("有点问题");
        return message;
    }
}
