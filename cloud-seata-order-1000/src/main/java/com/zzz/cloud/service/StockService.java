package com.zzz.cloud.service;

import com.zzz.cloud.entity.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zjd
 * @Date 2020/12/20 20:05
 */
@FeignClient("seata-storage-service")
public interface StockService {

    @PostMapping("/stock")
    void deductionStock(Stock stock);
}
