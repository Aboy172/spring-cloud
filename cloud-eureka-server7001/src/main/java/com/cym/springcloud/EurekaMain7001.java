package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cym
 * @date 2022-05-06  03:21
 * @description Eureka启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    
    public static void main(String[] args){
      SpringApplication.run(EurekaMain7001.class, args);
    }

    
}
