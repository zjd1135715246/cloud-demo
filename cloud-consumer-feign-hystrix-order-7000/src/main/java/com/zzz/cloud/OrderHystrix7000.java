package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Date 2020/12/11 21:09
 * @Created by zjd
 */
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
public class OrderHystrix7000 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrix7000.class);
    }
}
