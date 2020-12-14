package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Date 2020/12/14 20:49
 * @Created by zjd
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbit8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbit8801.class);
    }
}
