package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Date 2020/12/13 14:04
 * @Created by zjd
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527 {

    public static void main(String[] args) {
        SpringApplication.run(Gateway9527.class);
    }
}
