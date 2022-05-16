package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author cym
 * @date 2022-05-08  05:23
 * @description Hystrix-Payment启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class PaymentHystrixMain8001 {
  
  public static void main(String[] args){
    SpringApplication.run(PaymentHystrixMain8001.class, args);
  }

}
