package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@SpringBootApplication
@EnableEurekaClient
public class P7002Main {
    public static void main(String[] args) {
        SpringApplication.run(P7002Main.class);
    }
}
