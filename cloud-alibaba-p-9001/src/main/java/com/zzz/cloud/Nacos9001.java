package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Date 2020/12/15 20:36
 * @Created by zjd
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Nacos9001 {

    public static void main(String[] args) {
        SpringApplication.run(Nacos9001.class);
    }
}
