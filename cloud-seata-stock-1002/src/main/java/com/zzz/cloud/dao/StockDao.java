package com.zzz.cloud.dao;

import com.zzz.cloud.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zjd
 * @Date 2020/12/20 19:48
 */
@Mapper
public interface StockDao {

    void updateStock(Stock stock);
}
