package com.zzz.cloud.service;

import com.zzz.cloud.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zjd
 * @Date 2020/12/20 20:09
 */
@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping("/pay")
    void pay(Account account);
}
