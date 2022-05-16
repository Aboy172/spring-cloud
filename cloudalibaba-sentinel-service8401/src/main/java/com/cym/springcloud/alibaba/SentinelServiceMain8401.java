package com.cym.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-13  15:08
 * @description Sentinel 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain8401 {
  public static void main(String[] args){
    SpringApplication.run(SentinelServiceMain8401.class, args);
  }
}
