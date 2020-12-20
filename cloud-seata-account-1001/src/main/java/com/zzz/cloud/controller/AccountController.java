package com.zzz.cloud.controller;

import com.zzz.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjd
 * @Date 2020/12/20 20:34
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/pay")
    public void pay(Long userId,Long money){
        accountService.pay(userId,money);
    }
}
