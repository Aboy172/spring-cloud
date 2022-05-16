package com.cym.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-13  15:10
 * @description
 */
@RestController
@Slf4j
public class FlowLimitController {

  @GetMapping("/testA")
  public String testA() {
    return "--------testA";
  }

  @GetMapping("/testB")
  public String testB() {
    try {
      TimeUnit.MILLISECONDS.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    log.info(Thread.currentThread().getName() + "\t" + "....testB");

    return "--------testB";
  }
  @GetMapping("/testHotKey")
  @SentinelResource(value = "testHotKey",blockHandler = "dealTestHotKey")
  public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
      @RequestParam(value = "p2", required = false) String p2) {
    return "-----------testHotKey";
  }
  public String dealTestHotKey(String p1,String p2, BlockException exception) {
    return "-----------dealTestHotKey";
  }
}
