package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Date 2020/12/9 21:09
 * @Created by zjd
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class);
    }
}
