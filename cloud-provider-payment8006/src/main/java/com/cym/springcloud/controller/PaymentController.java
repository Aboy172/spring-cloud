package com.cym.springcloud.controller;


import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-07  19:20
 * @description Consul请求类
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  public String serverPort;

  @RequestMapping("/payment/consul")
  public String paymentZk() {
    return "springCloud with consul:" + serverPort + "\t" + UUID.randomUUID();
  }

}
