package com.cym.springclooud.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author cym
 * @date 2022-05-11  22:10
 * @description
 */
@Configuration
@RefreshScope
@Data
public class ApplicationContextConfig {


  @Value("${config.info}")
  private String configInfo;



}
