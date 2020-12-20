package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zjd
 * @Date 2020/12/20 11:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PSentinel9003 {
    public static void main(String[] args) {
        SpringApplication.run(PSentinel9003.class);
    }
}
