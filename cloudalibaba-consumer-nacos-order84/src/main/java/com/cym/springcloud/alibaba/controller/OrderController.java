package com.cym.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cym.springcloud.alibaba.service.OrderServiceFeign;
import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.vo.CommonResult;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-14  19:10
 * @description
 */
@RestController
@Slf4j
public class OrderController {

  @Resource
  private OrderServiceFeign orderServiceFeign;

  @GetMapping("/consumer/fallback/{id}")
  //@SentinelResource(value="fallback",fallback = "handlerFallback")
  //@SentinelResource(value="fallback",blockHandler = "blockHandler")
  @SentinelResource(value="fallback",fallback = "handlerFallback",blockHandler = "blockHandler")
  public CommonResult<Payment> consumerPayment(@PathVariable("id") Long id)
      throws IllegalAccessException {
    CommonResult<Payment> result = orderServiceFeign.paymentForMySql(id);
    if (id == 4) {
      throw new IllegalAccessException("IllegalAccessException 非法参数异常......");
    }else if (result.getDate() == null){
      throw new NullPointerException("NullPointerException 空指针异常........");

    }
    return result;

  }
  public CommonResult handlerFallback(@PathVariable("id") Long id){
    Payment payment = new Payment(id, null);
    return new CommonResult<>(444,"兜底异常handlerFallback,exception内容：");
  }
  public CommonResult blockHandler(@PathVariable("id") Long id, BlockException block){
    Payment payment = new Payment(id, null);
    return new CommonResult<>(445,"sentinel限流,exception内容：" + block.getMessage(),payment);
  }

}
