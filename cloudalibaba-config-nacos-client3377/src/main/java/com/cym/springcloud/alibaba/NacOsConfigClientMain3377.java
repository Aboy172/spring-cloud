package com.cym.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-12  19:54
 * @description nacos-client启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacOsConfigClientMain3377 {
    public static void main(String[] args){
      SpringApplication.run(NacOsConfigClientMain3377.class, args);
    }
}
