package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Date 2020/12/19 14:34
 * @Created by zjd
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Sentinel8401 {
    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401.class);
    }
}
