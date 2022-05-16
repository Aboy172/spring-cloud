package com.cym.springcloud.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cym
 * @date 2022-05-08  04:18
 * @description feign日志配置类
 */
@Configuration
public class FeignConfig {

  @Bean
  Logger.Level feignLoggerLevel(){
    return Level.FULL;
  }

}
