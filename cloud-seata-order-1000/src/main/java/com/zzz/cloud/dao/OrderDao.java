package com.zzz.cloud.dao;

import com.zzz.cloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zjd
 * @Date 2020/12/20 19:48
 */
@Mapper
public interface OrderDao {

    void insertOrder(Order order);

    void updateOrder(Long id);
}
