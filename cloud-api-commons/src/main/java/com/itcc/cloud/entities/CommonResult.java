package com.itcc.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by caocaixia on 2021/2/24 12:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {
        this(code,message,null);
    }
}
