package com.cym.springcloud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cym
 * @date 2022-05-04  22:54
 * @description 通用返回数据类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private  String message;



    private Object date;

    public CommonResult (Integer code,String message) {
        this(code,message,null);
    }

    public static  CommonResult success() {
        return new CommonResult(CommonResultEnum.SUCCESS.getCode(),CommonResultEnum.SUCCESS.getMessage(),null);
    }
    /**
     * 成功的返回结果
     *
     * @param obj
     * @return
     */
    public static  CommonResult success(Object obj) {
        return new CommonResult(CommonResultEnum.SUCCESS.getCode(), CommonResultEnum.SUCCESS.getMessage(), obj);
    }

    /**
     * 失败的返回结果
     * @param commonResultEnum
     * @return
     */
    public static CommonResult error(CommonResultEnum commonResultEnum) {
        return new CommonResult(commonResultEnum.getCode(), commonResultEnum.getMessage(), null);
    }

    /**
     * 失败的返回结果
     *
     * @param commonResultEnum
     * @param obj
     * @return
     */
    public static CommonResult error(CommonResultEnum commonResultEnum, Object obj) {
        return new CommonResult(commonResultEnum.getCode(), commonResultEnum.getMessage(), obj);
    }

}
