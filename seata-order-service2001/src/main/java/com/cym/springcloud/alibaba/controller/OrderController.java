package com.cym.springcloud.alibaba.controller;

import com.cym.springcloud.alibaba.domain.Order;
import com.cym.springcloud.alibaba.service.OrderService;
import com.cym.springcloud.vo.CommonResult;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-15  17:56
 * @description
 */
@RestController
@Slf4j
public class OrderController {

  @Resource
  private OrderService orderService;

  @GetMapping("/order/create")
  public CommonResult<Order> createOrder(Order order){
    orderService.createOrder(order);
    return new CommonResult<>(200, "订单创建成功");
  }
}
