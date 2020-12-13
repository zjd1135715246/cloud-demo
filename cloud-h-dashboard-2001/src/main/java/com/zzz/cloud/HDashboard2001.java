package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Date 2020/12/12 14:12
 * @Created by zjd
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HDashboard2001 {

    public static void main(String[] args) {
        SpringApplication.run(HDashboard2001.class);
    }
}
