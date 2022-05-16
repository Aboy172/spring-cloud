package com.cym.springcloud.alibaba;

/**
 * @author cym
 * @date 2022-05-12  17:18
 * @description nacos-order启动类
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacOsOrderMain83 {
  public static void main(String[] args){
    SpringApplication.run(NacOsOrderMain83.class, args);
  }

}
