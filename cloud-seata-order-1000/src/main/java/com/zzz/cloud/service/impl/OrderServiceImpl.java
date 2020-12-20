package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.OrderDao;
import com.zzz.cloud.entity.Order;
import com.zzz.cloud.service.AccountService;
import com.zzz.cloud.service.OrderService;
import com.zzz.cloud.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjd
 * @Date 2020/12/20 19:48
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private StockService stockService;

    @Autowired
    private AccountService accountService;

    @Override
    public void createOrder(Order order) {
        //下单
        orderDao.insertOrder(order);
        //扣减库存
        stockService.deductionStock(order.getStockId());
        //用户扣钱
        accountService.pay(order.getUserId(),order.getAmount());
        //成功后修改订单状态
        orderDao.updateOrder(order.getId());
    }
}
