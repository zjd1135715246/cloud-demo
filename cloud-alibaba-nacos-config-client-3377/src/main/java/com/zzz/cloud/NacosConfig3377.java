package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Date 2020/12/15 21:16
 * @Created by zjd
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3377.class);
    }
}
