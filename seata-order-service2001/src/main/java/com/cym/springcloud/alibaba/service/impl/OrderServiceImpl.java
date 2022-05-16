package com.cym.springcloud.alibaba.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cym.springcloud.alibaba.domain.Order;
import com.cym.springcloud.alibaba.mapper.OrderMapper;
import com.cym.springcloud.alibaba.service.AccountServiceFeign;
import com.cym.springcloud.alibaba.service.OrderService;
import com.cym.springcloud.alibaba.service.StorageServiceFeign;
import io.seata.spring.annotation.GlobalTransactional;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author cym
 * @description 针对表【t_order(订单表)】的数据库操作Service实现
 * @createDate 2022-05-15 18:01:42
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService {

  @Resource
  private OrderMapper orderMapper;

  @Resource
  private AccountServiceFeign accountServiceFeign;
  @Resource
  private StorageServiceFeign storageServiceFeign;

  /**
   * 创建订单-->减库存-->减用户余额-->修改订单状态-->结束下单
   * @param order 订单
   */
  @Override
  @GlobalTransactional(name ="test-create-order",rollbackFor = Exception.class)
  public void createOrder(Order order) {
    log.info("------->开始创建订单");
    orderMapper.createOrder(order);
    log.info("------->订单微服务开始减库存，做扣减");
    storageServiceFeign.decrease(order.getProductId(), order.getCount());
    log.info("------->订单微服务开始减库存，做扣减end");

    log.info("------->订单微服务开始调用账号，做扣钱");
    accountServiceFeign.deductMoney(order.getUserId(), order.getMoney());
    log.info("------->订单微服务开始调用账号，做扣钱end");

    log.info("------->订单微服务修改订单状态");
    orderMapper.updateOrder(order.getUserId(), 0);
    log.info("------->订单微服务修改订单状态为end");

    log.info("------->下订单结束O(∩_∩)O哈哈~");
  }
}




