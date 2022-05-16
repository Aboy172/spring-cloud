package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cym
 * @date 2022-05-10  15:25
 * @description gateway启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GateWayMain9527 {
  public static void main(String[] args){
    SpringApplication.run(GateWayMain9527.class, args);
  }

}
