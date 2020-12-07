package com.zzz.cloud.dao;

import entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@Mapper
public interface PaymentDao {

    int insertOne(Payment payment);

    Payment getOne(Integer id);
}
