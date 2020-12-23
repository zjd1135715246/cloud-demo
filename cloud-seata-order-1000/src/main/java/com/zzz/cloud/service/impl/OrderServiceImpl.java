package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.OrderDao;
import com.zzz.cloud.entity.Account;
import com.zzz.cloud.entity.Orders;
import com.zzz.cloud.entity.Stock;
import com.zzz.cloud.service.AccountService;
import com.zzz.cloud.service.OrderService;
import com.zzz.cloud.service.StockService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
    @GlobalTransactional(name = "SEATA_GROUP",rollbackFor = Exception.class)
    public void createOrder(Orders order) {
        System.out.println(order);
        order.setStatus(0);
        order.setOrderNo(UUID.randomUUID().toString());
        //下单
        orderDao.insertOrder(order);
        //扣减库存
        Stock stock = new Stock();
        stock.setId(order.getStockId());
        stock.setNum(order.getGoodsNum());
        stockService.deductionStock(stock);
        //用户扣钱
        Account account = new Account();
        account.setId(order.getUserId());
        account.setAmount(order.getAmount());
        accountService.pay(account);
        //成功后修改订单状态
        order.setStatus(1);
        orderDao.updateOrder(order.getId());
    }
}
