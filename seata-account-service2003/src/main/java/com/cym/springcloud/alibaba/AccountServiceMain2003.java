package com.cym.springcloud.alibaba;

import com.cym.springcloud.alibaba.config.ApplicationConTextConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * @author cym
 * @date 2022-05-15  20:06
 * @description
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import(ApplicationConTextConfig.class)
@EnableDiscoveryClient
@MapperScan("com.cym.springcloud.alibaba.mapper")
public class AccountServiceMain2003 {
  public static void main(String[] args){
    SpringApplication.run(AccountServiceMain2003.class, args);
  }
}
