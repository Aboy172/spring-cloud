package com.cym.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cym
 * @date 2022-05-14  19:09
 * @description nacos-order 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacOsOrderMain84 {
  public static void main(String[] args){
    SpringApplication.run(NacOsOrderMain84.class, args);
  }

}
