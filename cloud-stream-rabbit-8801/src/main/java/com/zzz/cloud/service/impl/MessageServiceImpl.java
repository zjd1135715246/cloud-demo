package com.zzz.cloud.service.impl;

import com.zzz.cloud.service.MessageService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Date 2020/12/14 20:52
 * @Created by zjd
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageChannel output; //推送管道

    @Override
    public String send() {
        String string = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(string).build());
        System.out.println("发送消息为："+string);
        return "";
    }
}
