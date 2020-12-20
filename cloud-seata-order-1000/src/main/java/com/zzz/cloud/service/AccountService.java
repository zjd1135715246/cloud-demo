package com.zzz.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zjd
 * @Date 2020/12/20 20:09
 */
@FeignClient("")
public interface AccountService {

    @GetMapping("/pay")
    void pay(Long userId,Long money);
}
