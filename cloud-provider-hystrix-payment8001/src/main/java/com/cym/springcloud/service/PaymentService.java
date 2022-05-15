package com.cym.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cym
 */
@Service
public class PaymentService {

  public String paymentInfoOk(Integer id) {
    return "线程池：" + Thread.currentThread().getName() + "    paymentInfoOk,id:" + id;
  }


  @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
      @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "7000")
  })
  public String paymentInfoTimeout() {
    int timeOutSecond = 4;
    //int i = 10/0;
    try {
      TimeUnit.SECONDS.sleep(timeOutSecond);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return "线程池：" + Thread.currentThread().getName() + "   耗时:" + timeOutSecond + "秒";
  }

  public String paymentInfoTimeoutHandler() {
    return "服务降级.....";
  }

  @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback",commandProperties = {
      @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
      //断路器开启的条件最少10个请求
      @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
      //断路器开启以后过10s会处于半开状态，放请求进度
      @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
      //执行失败的比例
      @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
  })
  public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
    if (id < 0 ){
      throw new RuntimeException("id<0,运行时异常");
    }
    String serialNumber = IdUtil.simpleUUID();
    return Thread.currentThread().getName() + "\t" + "调用函数为,流水号：" + serialNumber;


  }

  public String paymentCircuitBreakerFallback(@PathVariable("id") Integer id) {

    return "id不能为负数,请稍后再试"+ "\t" + "调用失败,id：" + id;
  }
}
