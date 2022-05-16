package com.cym.springclooud.controller;

import com.cym.springclooud.config.ApplicationContextConfig;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-11  20:53
 * @description 请求
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
