package com.cym.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-14  18:53
 * @description nacos-payment 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacOsPaymentMain9003 {
  
  public static void main(String[] args){
    SpringApplication.run(NacOsPaymentMain9003.class, args);
  }

}
