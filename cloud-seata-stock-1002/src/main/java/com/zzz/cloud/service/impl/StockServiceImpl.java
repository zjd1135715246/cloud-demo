package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.StockDao;
import com.zzz.cloud.entity.Stock;
import com.zzz.cloud.service.StockService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjd
 * @Date 2020/12/20 19:48
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDao stockDao;

    @Override
    public void deductionStock(Long stockId, Long num) {
        Stock stock = new Stock();
        stock.setId(stockId);
        stock.setNum(num);
        stockDao.updateStock(stock);
    }
}
