package com.cym.springcloud.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cym
 * @date 2022-05-07  19:38
 * @description 请求类
 */
@RestController
@Slf4j
public class OrderController {

  private static final String INVOKE_URL = "http://cloud-provider-payment";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/consul")
  public String paymentInfo() {
    String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    log.info("result = " + result);
    return result;
  }


}
