package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.AccountDao;
import com.zzz.cloud.entity.Account;
import com.zzz.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjd
 * @Date 2020/12/20 20:37
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    @Override
    public void pay(Account account) {
        System.out.println(10/0);
        accountDao.updateAccount(account);
    }
}
