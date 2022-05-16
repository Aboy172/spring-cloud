package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-06  20:31
 * @description Payment8004启动类
 */
@SpringBootApplication
@EnableDiscoveryClient

public class PaymentMain8004 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8004.class, args);
  }
}
