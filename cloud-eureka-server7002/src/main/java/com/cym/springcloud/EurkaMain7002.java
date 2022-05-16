package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cym
 * @date 2022-05-06  18:15
 * @description Eureka7002启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurkaMain7002 {
    
    public static void main(String[] args){
      SpringApplication.run(EurkaMain7002.class, args);
    }
}
