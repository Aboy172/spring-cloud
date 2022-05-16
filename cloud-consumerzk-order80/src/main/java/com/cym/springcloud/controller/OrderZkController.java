package com.cym.springcloud.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cym
 * @date 2022-05-07  18:41
 * @description zk-order请求类
 */
@RestController
@Slf4j
public class OrderZkController {


  private static final String INVOKE_URL = "http://cloud-provider-payment";

  @Resource
  private RestTemplate restTemplate;
  @GetMapping("/consumer/payment/zk")
  public String paymentInfo(){
    String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    log.info("result = " + result);
    return result;
  }

}
