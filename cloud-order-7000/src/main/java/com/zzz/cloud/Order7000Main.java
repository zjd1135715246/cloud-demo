package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zjd
 * @date 2020/12/7
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-P-SVR",configuration = MySelfRule.class)
public class Order7000Main {

    public static void main(String[] args) {
        SpringApplication.run(Order7000Main.class);
    }
}
