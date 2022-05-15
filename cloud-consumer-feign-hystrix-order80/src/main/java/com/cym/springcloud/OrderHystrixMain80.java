package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cym
 * @date 2022-05-09  22:11
 * @description Hystrix-Order启动类
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
  public static void main(String[] args){
    SpringApplication.run(OrderHystrixMain80.class, args);
  }

}
