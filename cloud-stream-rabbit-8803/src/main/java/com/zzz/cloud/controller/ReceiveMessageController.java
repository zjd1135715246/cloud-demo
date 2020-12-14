package com.zzz.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/14 21:05
 * @Created by zjd
 */
@RestController
@RequestMapping("/receive")
@EnableBinding(Sink.class)
public class ReceiveMessageController {

    @Value(("${server.port}"))
    private String serverPort;


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){

        System.out.println("当前端口："+serverPort+"---收到消息:"+message.getPayload());
    }
}
