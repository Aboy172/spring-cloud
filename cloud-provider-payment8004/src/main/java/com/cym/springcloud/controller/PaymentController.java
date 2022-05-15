package com.cym.springcloud.controller;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-06 20:48
 * @description 请求
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @RequestMapping("/payment/zk")
  public String paymentZk() {
    return "springCloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID();
  }
}
