package com.cym.springcloud.alibaba;

import com.cym.springcloud.alibaba.config.ApplicationConTextConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * @author cym
 * @date 2022-05-15  17:16
 * @description order启动类
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import(ApplicationConTextConfig.class)
@EnableDiscoveryClient
@EnableFeignClients
public class OrderService2001 {
  public static void main(String[] args){
    SpringApplication.run(OrderService2001.class, args);
  }
}
