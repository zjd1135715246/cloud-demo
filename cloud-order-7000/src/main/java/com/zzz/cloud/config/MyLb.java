package com.zzz.cloud.config;

import com.zzz.cloud.config.MyLoadBalance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Date 2020/12/9 20:30
 * @Created by zjd
 */
@Component
public class MyLb implements MyLoadBalance {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final  int getAndIncrement(){
        int current;
        int next;

        do {
            current = this.atomicInteger.get();
            next = current>=214783647?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("第几次访问："+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
