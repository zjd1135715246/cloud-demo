package com.zzz.cloud.controller;

import com.zzz.cloud.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjd
 * @Date 2020/12/20 19:47
 */
@RestController
@RequestMapping("/order")
public class StockController {

    @Autowired
    private StockService stockService;


    @GetMapping("/stock")
    public void deductionStock(Long stockId,Long num){
        stockService.deductionStock(stockId,num);
    }
}
