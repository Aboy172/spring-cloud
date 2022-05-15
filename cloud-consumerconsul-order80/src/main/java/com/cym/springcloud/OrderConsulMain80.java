package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-07  19:28
 * @description order-consul启动网络
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
  
  public static void main(String[] args){
    SpringApplication.run(OrderConsulMain80.class, args);
  }

}
