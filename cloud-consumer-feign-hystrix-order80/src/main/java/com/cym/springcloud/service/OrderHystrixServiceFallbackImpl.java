package com.cym.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author cym
 * @date 2022-05-09  23:56
 * @description
 */
@Component
public class OrderHystrixServiceFallbackImpl implements OrderHystrixService{

  @Override
  public String paymentInfoOk(Integer id) {
    return paymentGlobalFallbackMethod(1);
  }

  @Override
  public String paymentInfoTimeout() {
    return paymentGlobalFallbackMethod(1);
}

  @Override
  public String paymentInfoCircuitBreaker(Integer id) {
    return paymentGlobalFallbackMethod(1);

  }

  public String paymentGlobalFallbackMethod(Integer id){
    return "熔断" + id;

  }
}
