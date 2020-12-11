package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zjd
 * @date 2020/12/10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PHystrixMain {

    public static void main(String[] args) {
        SpringApplication.run(PHystrixMain.class);
    }
}
