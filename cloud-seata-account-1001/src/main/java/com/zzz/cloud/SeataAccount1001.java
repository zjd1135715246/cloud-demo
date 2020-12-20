package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zjd
 * @Date 2020/12/20 20:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeataAccount1001 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccount1001.class);
    }
}
