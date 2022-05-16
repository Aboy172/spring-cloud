package com.cym.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cym.springcloud.alibaba.myhandlers.CustomerBlockHandler;
import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.vo.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-14  18:00
 * @description
 */
@RestController
public class RateLimitController {

  @GetMapping("/byResource")
  @SentinelResource(value = "byResource", blockHandler = "handlerException")
  public CommonResult byResource() {
    return new CommonResult(200, "按资源名限流测试ok", new Payment(2022L, "serial1001"));
  }

  @GetMapping("/rateLimit/byUrl")
  @SentinelResource(value = "rateLimit/byUrl")
  public CommonResult rateLimitByUrl() {
    return new CommonResult(200, "按资源名限流测试ok", new Payment(2022L, "serial1002"));
  }


  public CommonResult handlerException(BlockException exception) {
    return new CommonResult(444, exception.getClass().getCanonicalName() + "\t服务不可用");
  }

  @GetMapping("/customer/customerBlockHandler")
  @SentinelResource(value = "customerBlockHandler", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "customerBlockException")
  public CommonResult customerBlockException() {
    return new CommonResult(200, "客户自定义", new Payment(2020L, "serial003"));

  }


}
