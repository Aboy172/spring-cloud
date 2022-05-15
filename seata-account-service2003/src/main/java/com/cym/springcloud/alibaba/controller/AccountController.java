package com.cym.springcloud.alibaba.controller;

import com.cym.springcloud.alibaba.service.AccountService;
import com.cym.springcloud.vo.CommonResult;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-15  20:08
 * @description
 */
@RestController
public class AccountController {
  @Resource
  private AccountService accountService;

  @PostMapping("/account/deductmoney")
  CommonResult deductMoney(@RequestParam("userId")Long userId,@RequestParam("money") BigDecimal money){
    try {
      TimeUnit.SECONDS.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    accountService.deductMoney(userId,money);
    return new CommonResult(200,"减去用户id：" + userId + "金额" + money );
  }
}
