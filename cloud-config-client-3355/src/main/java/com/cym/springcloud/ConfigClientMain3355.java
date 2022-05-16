package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cym
 * @date 2022-05-11  18:30
 * @description config客户端启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
  public static void main(String[] args){
    SpringApplication.run(ConfigClientMain3355.class, args);
  }

}
