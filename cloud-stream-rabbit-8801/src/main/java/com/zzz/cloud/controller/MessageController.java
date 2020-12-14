package com.zzz.cloud.controller;

import com.zzz.cloud.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/14 20:57
 * @Created by zjd
 */
@RequestMapping("/msg")
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        messageService.send();
        return "ok";
    }
}
