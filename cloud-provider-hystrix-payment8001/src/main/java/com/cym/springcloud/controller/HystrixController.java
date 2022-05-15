package com.cym.springcloud.controller;

import com.cym.springcloud.service.PaymentService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-08  05:48
 * @description hystrix请求
 */
@RestController
@Slf4j
public class HystrixController {

  @Resource
  private PaymentService paymentService;


  @GetMapping("/payment/hystrix/{id}")
  public String paymentInfoOk(@PathVariable("id") Integer id) {
    return paymentService.paymentInfoOk(id);
  }

  @GetMapping("/payment/hystrix/timeout")
  public String paymentInfoTimeout() {
    return paymentService.paymentInfoTimeout();
  }
  @GetMapping("/payment/hystrix/circuitBreaker/{id}")
  public String paymentInfoCircuitBreaker(@PathVariable("id")Integer id){

    return  paymentService.paymentCircuitBreaker(id);
  }

}
