package com.zzz.cloud.service;

import entity.BackMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zjd
 * @Date 2020/12/20 11:43
 */
@Component
@FeignClient(value = "nacos-payment-provider")
public interface OrderService {

    @GetMapping("/pay")
    BackMessage pay(Integer id);
}
