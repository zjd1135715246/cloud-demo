package com.zzz.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2020/12/6 16:57
 * @Created by zjd
 */
@Data
@AllArgsConstructor
public class BackMessage<T> {

    private Integer code;
    private String message;
    private  T data;

    public BackMessage(String message,T data) {
        this.message=message;
        this.data=data;
    }
}
