package com.zzz.cloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
        //int x = 10/0;
        /*try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        message.setCode(200);
        message.setMessage("7004服务端执行了3s,当前线程id："+Thread.currentThread().getName()+"---"+id);


        return message;
    }

    public BackMessage getOneSleepHandler(Integer id) {
        BackMessage message = new BackMessage();
        message.setCode(400);
        message.setMessage("7004服务有点问题");
        return message;
    }


    //=====服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    @Override
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        if(id < 0)
        {
            throw new RuntimeException("******id 不能负数");
        }

        return Thread.currentThread().getName()+"\t"+"调用成功，流水号: " ;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id)
    {
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " +id;
    }
}
