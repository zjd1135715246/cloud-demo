package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Date 2020/12/14 21:13
 * @Created by zjd
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbit8803 {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbit8803.class);
    }
}
