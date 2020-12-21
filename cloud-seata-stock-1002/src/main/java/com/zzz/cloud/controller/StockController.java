package com.zzz.cloud.controller;

import com.zzz.cloud.entity.Stock;
import com.zzz.cloud.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zjd
 * @Date 2020/12/20 19:47
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;


    @PostMapping("/stock")
    public void deductionStock(@RequestBody Stock stock){
        System.out.println(stock);
        stockService.deductionStock(stock);
    }
}
