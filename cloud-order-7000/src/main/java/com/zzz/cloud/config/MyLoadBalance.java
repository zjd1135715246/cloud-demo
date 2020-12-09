package com.zzz.cloud.config;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Date 2020/12/9 20:29
 * @Created by zjd
 */
public interface MyLoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
