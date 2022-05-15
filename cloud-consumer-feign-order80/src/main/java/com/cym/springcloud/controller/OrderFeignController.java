package com.cym.springcloud.controller;

import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.service.PaymentFeignService;
import com.cym.springcloud.vo.CommonResult;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-08  03:38
 * @description 请求类
 */
@RestController
@Slf4j
public class OrderFeignController {

  @Resource
  private PaymentFeignService paymentFeignService;

  @GetMapping("/consumer/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
    return paymentFeignService.getPayment(id);

  }
  @GetMapping("/consumer/feign/timeout")
  public String timeout(){
    return paymentFeignService.timeout();
  }

  @GetMapping("/consumer/payment/zk")
  public String paymentZk(){
    return paymentFeignService.paymentZk();
  }

}
