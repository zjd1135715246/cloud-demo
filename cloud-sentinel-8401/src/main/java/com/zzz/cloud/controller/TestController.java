package com.zzz.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zzz.cloud.back.MyFallBack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/12/19 14:35
 * @Created by zjd
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/a")
    public String getA(){

        return "aaa";
    }

    @GetMapping("/b")
    public String getB(){

        return "bbbb";
    }

    @GetMapping("/c")
    @SentinelResource(value = "c",blockHandler = "myBack")
    public String getC(){
        return "测试成功，cccc";
    }
    public String myBack(BlockException exception){
        return "自定义返回，点太多了"+exception.getMessage();
    }

    @GetMapping("/d")
    @SentinelResource(value = "d",blockHandlerClass = MyFallBack.class,blockHandler = "globalBack")
    public String getD(){
        return "测试成功，dddd";
    }

}
