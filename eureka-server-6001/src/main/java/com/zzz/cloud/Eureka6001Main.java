package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zjd
 * @date 2020/12/8
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka6001Main {

    public static void main(String[] args) {
        SpringApplication.run(Eureka6001Main.class);
    }
}
