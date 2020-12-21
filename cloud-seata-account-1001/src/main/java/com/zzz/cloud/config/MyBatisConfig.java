package com.zzz.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjd
 * @date 2020/12/21
 */
@Configuration
@MapperScan({"com.zzz.cloud.dao"})
public class MyBatisConfig {
}
