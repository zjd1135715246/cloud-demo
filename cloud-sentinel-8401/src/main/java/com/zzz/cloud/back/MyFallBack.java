package com.zzz.cloud.back;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Date 2020/12/20 10:25
 * @author  by zjd
 */
public class MyFallBack {

    public static  String globalBack(BlockException exception){
        return "全局返回"+exception.getClass();
    }

}
