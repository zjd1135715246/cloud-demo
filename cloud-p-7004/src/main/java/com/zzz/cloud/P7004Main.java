package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zjd
 * @date 2020/12/9
 */
@SpringBootApplication
@EnableDiscoveryClient
public class P7004Main {

    public static void main(String[] args) {
        SpringApplication.run(P7004Main.class);
    }
}
