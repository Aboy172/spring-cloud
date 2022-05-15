package com.cym.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cym
 * @date 2022-05-12  17:30
 * @description
 */
@FeignClient(name = "nacos-payment-provider")
@Component
public interface OrderServiceFeign {

  /**
   * payment
   * @param id
   * @return
   */
  @GetMapping("/payment/nacos/{id}")
   String getPayment(@PathVariable("id") Integer id);
}
