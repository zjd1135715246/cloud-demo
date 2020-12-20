package com.zzz.cloud.controller;

import entity.BackMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjd
 * @Date 2020/12/20 11:18
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    Map<Integer,BackMessage> messageMap = new HashMap<>();

    {
        messageMap.put(1,new BackMessage(1,"xx当前port"+port,"shu"));
        messageMap.put(2,new BackMessage(2,"xx当前port"+port,"shu"));
        messageMap.put(3,new BackMessage(3,"xx当前port"+port,"shu"));
    }

    @GetMapping("/pay/{id}")
    public BackMessage pay(@PathVariable("id")Integer id){
        BackMessage message = messageMap.get(id);
        message.setMessage("xx当前port"+port);
        return message;
    }

}
