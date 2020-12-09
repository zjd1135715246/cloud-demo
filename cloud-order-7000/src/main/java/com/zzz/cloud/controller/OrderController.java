package com.zzz.cloud.controller;

import com.alibaba.fastjson.JSON;
import com.netflix.appinfo.InstanceInfo;
import com.zzz.cloud.config.MyLoadBalance;
import entity.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import utils.RestUtils;

import java.net.URI;
import java.util.List;

/**
 * @author zjd
 * @date 2020/12/7
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MyLoadBalance myLoadBalance;

    @Autowired
    private DiscoveryClient discoveryClient;

    private String PROVIDE_URL = "http://CLOUD-P-SVR";

    @GetMapping("/getOne")
    public BackMessage getOnePayment(Integer id){
        BackMessage message = JSON.parseObject(JSON.toJSONString(restTemplate.getForObject(PROVIDE_URL + "/pay/payment?id=" + id, Object.class)),BackMessage.class);
        return message;
    }

    @GetMapping("/payment/lb")
   public String getPayLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-P-SVR");

        if(instances.isEmpty()){
            return null;
        }

        ServiceInstance instance = myLoadBalance.instance(instances);
        URI uri = instance.getUri();
        return restTemplate.getForObject(uri+"/pay/lb",String.class);
    }
}
