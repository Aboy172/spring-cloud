package com.cym.springcloud.service;

import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cym
 * @date 2022-05-08  03:29
 * @description Feign调用接口
 */
@Component
@FeignClient("CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

  /**
   * 根据主键获取支付信息
   * @param id
   * @return
   */
  @GetMapping("/payment/get/{id}")
  CommonResult<Payment> getPayment(@PathVariable("id") Long id);

  /**
   * feign调用客户端连接时间三秒
   * @return
   */
  @GetMapping("/payment/feign/timeout")
  String timeout();

  /**
   * 调用链路跟踪
   * @return
   */
  @GetMapping("/payment/zk")
  public String paymentZk();

}
