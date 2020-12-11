package com.zzz.cloud.service;

import entity.BackMessage;
import entity.Payment;
import feign.Param;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Date 2020/12/9 21:09
 * @Created by zjd
 */
@Component
@FeignClient(value = "CLOUD-P-SVR")
public interface PaymentFeignService {

    @GetMapping("/pay/payment/{id}")
    BackMessage getPaymentById(@PathVariable("id") Integer id);
}
