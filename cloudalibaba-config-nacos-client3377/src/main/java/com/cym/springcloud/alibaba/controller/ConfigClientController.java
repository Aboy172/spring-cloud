package com.cym.springcloud.alibaba.controller;

import com.cym.springcloud.alibaba.config.ApplicationContextConfig;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-11  18:31
 * @description configClient请求
 */
@RestController
public class ConfigClientController {



  @Resource
  private ApplicationContextConfig applicationContextConfig;

  @GetMapping("/configInfo")
  public String getConfigInfo() {
    return applicationContextConfig.getConfigInfo();
  }

}
