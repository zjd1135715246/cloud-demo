package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class P7001Main {
    public static void main(String[] args) {
        SpringApplication.run(P7001Main.class);
    }
}
