package com.cym.springcloud.alibaba.service;

import com.cym.springcloud.vo.CommonResult;
import java.math.BigDecimal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author cym
* @description
* @createDate 2022-05-15 18:31:59
*/
@FeignClient(value = "seata-account-service")
public interface AccountServiceFeign   {

  /**
   * 远程调用账号模块减钱
   * @param userId 用户id
   * @param money 减去的钱
   * @return 返回json数据结果集
   *
   */
  @PostMapping("/account/deductmoney")
  CommonResult deductMoney(@RequestParam("userId")Long userId,@RequestParam("money") BigDecimal money);
}
