package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-07  18:38
 * @description zk-order启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {

  public static void main(String[] args) {
    SpringApplication.run(OrderZkMain80.class, args);
  }

}
