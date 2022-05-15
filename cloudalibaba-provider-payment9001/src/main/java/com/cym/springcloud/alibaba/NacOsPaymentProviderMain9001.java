package com.cym.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cym
 * @date 2022-05-12  16:43
 * @description nacos-payment-provider启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacOsPaymentProviderMain9001 {
  public static void main(String[] args){
    SpringApplication.run(NacOsPaymentProviderMain9001.class, args);
  }
}
