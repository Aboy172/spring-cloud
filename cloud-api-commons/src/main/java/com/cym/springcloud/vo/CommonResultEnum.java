package com.cym.springcloud.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author cym
 * @date 2022-05-04  23:41
 * @description 通用返回数据枚举类
 */
@AllArgsConstructor
@ToString
@Getter
public enum CommonResultEnum {

    /**
     * 统一返回数据格式
     */
    SUCCESS(200, "插入数据库成功"),
    DB_INSERT_ERROR(444,"插入数据库失败"),
    DB_SELECT_ERROR(444,"没有查询到数据"),
    ERROR(500, "服务器启动失败");


    private final Integer code;
    private final String message;



}
