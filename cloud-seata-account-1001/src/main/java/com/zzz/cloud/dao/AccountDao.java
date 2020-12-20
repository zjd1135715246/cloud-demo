package com.zzz.cloud.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author zjd
 * @Date 2020/12/20 20:37
 */
@Mapper
public interface AccountDao {
    void updateAccount(Long userId, Long money);
}
