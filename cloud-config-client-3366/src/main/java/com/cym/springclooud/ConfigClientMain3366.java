package com.cym.springclooud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cym
 * @date 2022-05-11  20:51
 * @description config-rabbitmq启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
  public static void main(String[] args){
    SpringApplication.run(ConfigClientMain3366.class, args);
  }

}
