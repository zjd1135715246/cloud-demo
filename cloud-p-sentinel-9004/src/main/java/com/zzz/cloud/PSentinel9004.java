package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zjd
 * @Date 2020/12/20 11:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PSentinel9004 {
    public static void main(String[] args) {
        SpringApplication.run(PSentinel9004.class);
    }
}
