package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Date 2020/12/15 20:41
 * @Created by zjd
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Nacos9002 {

    public static void main(String[] args) {
        SpringApplication.run(Nacos9002.class);
    }
}
