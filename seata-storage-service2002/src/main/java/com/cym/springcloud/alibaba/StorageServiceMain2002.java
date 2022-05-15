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
 * @date 2022-05-15  19:37
 * @description storage-service 启动类
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import(ApplicationConTextConfig.class)
@EnableDiscoveryClient
@MapperScan("com.cym.springcloud.alibaba.mapper")
public class StorageServiceMain2002 {
  public static void main(String[] args){
    SpringApplication.run(StorageServiceMain2002.class, args);
  }
}
