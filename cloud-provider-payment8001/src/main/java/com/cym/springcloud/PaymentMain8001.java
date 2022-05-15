package com.cym.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cym
 * @date 2022-05-04  22:44
 * @description 支付模块启动入口
 */
@SpringBootApplication
@MapperScan("com.cym.springcloud.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {

    public static void main (String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
