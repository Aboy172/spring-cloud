package com.cym.springcloud.controller;

import com.cym.springcloud.service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-09  22:15
 * @description order请求
 */
@RestController
@Slf4j
public class OrderHystrixController {

  @Resource
  private OrderHystrixService orderHystrixService;

  /**
   * 支付成功
   *
   * @param id
   * @return
   */
  @GetMapping("/consumer/payment/hystrix/{id}")
  public String paymentInfoOk(@PathVariable("id") Integer id){
    return orderHystrixService.paymentInfoOk(id);
  }

  /**
   * 支付延时3秒
   * @return
   */
  @GetMapping("/consumer/payment/hystrix/timeout")
  @HystrixCommand()
  public String paymentInfoTimeout(){
    return orderHystrixService.paymentInfoTimeout();

  }

  @GetMapping("/consumer/payment/hystrix/circuitBreaker/{id}")
  public  String paymentHystrixCircuitBreaker(@PathVariable("id") Integer id){
    return orderHystrixService.paymentInfoCircuitBreaker(id);
  }



}
