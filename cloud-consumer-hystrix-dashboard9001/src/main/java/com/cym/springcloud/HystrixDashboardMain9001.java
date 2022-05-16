package com.cym.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author cym
 * @date 2022-05-10  10:14
 * @description hystrix dashboard启动类
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
  
  public static void main(String[] args){
    SpringApplication.run(HystrixDashboardMain9001.class, args);
  }

}
