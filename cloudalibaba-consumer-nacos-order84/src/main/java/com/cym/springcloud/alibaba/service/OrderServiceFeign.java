package com.cym.springcloud.alibaba.service;

import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cym
 * @date 2022-05-14  19:11
 * @description
 */

@FeignClient(name = "nacos-payment-provider")
public interface OrderServiceFeign {

  /**
   * 从mysql数据库中获取信息
   * @param id
   * @return
   */
  @GetMapping("/payment/{id}")
  CommonResult<Payment> paymentForMySql(@PathVariable("id") Long id);


}
