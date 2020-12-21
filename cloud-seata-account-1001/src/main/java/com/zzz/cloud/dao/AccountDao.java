package com.zzz.cloud.dao;

import com.zzz.cloud.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zjd
 * @Date 2020/12/20 20:37
 */
@Mapper
public interface AccountDao {
    void updateAccount(Account account);
}
