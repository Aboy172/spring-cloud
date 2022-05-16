package com.cym.springcloud.alibaba.controller;

import com.cym.springcloud.alibaba.service.OrderServiceFeign;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-12  17:24
 * @description nacos-order请求
 */
@RestController
@Slf4j
public class OrderNacOsController {



  @Resource
  private OrderServiceFeign orderServiceFeign;

  @GetMapping("/consumer/payment/get/{id}")
  public String paymentInfo(@PathVariable("id")Integer id){
    return orderServiceFeign.getPayment(id);

  }

}
