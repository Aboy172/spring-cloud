package com.cym.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cym
 * @date 2022-05-15  19:10
 * @description mybatis-plus配置类
 */
@Configuration
@MapperScan("com.cym.springcloud.alibaba.mapper")
public class MybatisPlusConfig {


}
