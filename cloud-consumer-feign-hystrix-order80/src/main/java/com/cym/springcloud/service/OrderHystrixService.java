package com.cym.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cym
 */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = OrderHystrixServiceFallbackImpl.class)
public interface OrderHystrixService {

  /**
   * 支付成功
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/{id}")
  String paymentInfoOk(@PathVariable("id") Integer id);

  /**
   * 支付延时3秒
   * @return
   */

  @GetMapping("/payment/hystrix/timeout")
  public String paymentInfoTimeout();

  /**
   * 熔断
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/circuitBreaker/{id}")
  String paymentInfoCircuitBreaker(@PathVariable("id")Integer id);
}

