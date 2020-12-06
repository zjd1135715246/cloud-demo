package com.zzz.cloud.dao;

import com.zzz.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description TODO
 * @Date 2020/12/6 16:58
 * @Created by zjd
 */
@Mapper
public interface PaymentDao {

    public  int insertOne(Payment payment);
}
