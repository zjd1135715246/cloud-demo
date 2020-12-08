package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Date 2020/12/8 20:21
 * @Created by zjd
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka6002Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka6002Main.class);
    }
}
