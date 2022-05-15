package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cym
 * @date 2022-05-08  03:27
 * @description Feign-Order启动类
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
  public static void main(String[] args){
    SpringApplication.run(OrderFeignMain80.class, args);
  }
}
