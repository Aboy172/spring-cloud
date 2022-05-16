package com.cym.springcloud.alibaba.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cym.springcloud.alibaba.domain.Order;

/**
* @author cym
* @description 针对表【t_order(订单表)】的数据库操作Service
* @createDate 2022-05-15 18:01:42
*/

public interface OrderService extends IService<Order> {

  /**
   * 创建订单
   * @param order 订单
   */
  void createOrder(Order order);






}
