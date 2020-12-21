package com.zzz.cloud.dao;

import com.zzz.cloud.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zjd
 * @Date 2020/12/20 19:48
 */
@Mapper
public interface OrderDao {

    void insertOrder(Orders order);

    void updateOrder(Long id);
}
