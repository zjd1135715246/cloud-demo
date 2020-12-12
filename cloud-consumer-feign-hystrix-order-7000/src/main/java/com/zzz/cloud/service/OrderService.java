package com.zzz.cloud.service;

import com.zzz.cloud.service.impl.OrderServiceImpl;
import entity.BackMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Date 2020/12/11 21:16
 * @Created by zjd
 */
@Component
@FeignClient(value = "CLOUD-P-SVR",fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping("/pay/sleep/{id}")
    BackMessage orderTest(@PathVariable("id") Integer id);
}
