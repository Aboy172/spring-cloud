package com.cym.springcloud.alibaba.mapper;

import com.cym.springcloud.alibaba.domain.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author cym
* @description 针对表【t_order(订单表)】的数据库操作Mapper
* @createDate 2022-05-15 18:01:42
* @Entity com.cym.springcloud.alibaba.domain.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {



  /**
   * 创建订单
   * @param order 订单
   */
  void createOrder(Order order);

  /**
   * 根据订单id修改订单状态
   * @param userId 订单id
   * @param status 订单状态
   */
  void updateOrder(@Param("userId")Long userId,@Param("status")Integer status);



}




