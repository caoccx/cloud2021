package com.itcc.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by caocaixia on 2021/2/23 15:33
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * JSON封装体
     * 这个方法用于前端判断对错
     * 404 not found
     *
     */
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
