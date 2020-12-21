package com.zzz.cloud.service;

import com.zzz.cloud.entity.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zjd
 * @Date 2020/12/20 20:05
 */
public interface StockService {

    void deductionStock(Stock stock);
}
