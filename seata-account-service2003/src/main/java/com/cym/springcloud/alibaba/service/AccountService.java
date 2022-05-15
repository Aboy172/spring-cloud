package com.cym.springcloud.alibaba.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cym.springcloud.alibaba.domain.Account;
import java.math.BigDecimal;

/**
* @author cym
* @description 针对表【t_account(账户表)】的数据库操作Service
* @createDate 2022-05-15 20:07:58
*/
public interface AccountService extends IService<Account> {

  /**
   * 减指定userId的余额
   * @param userId 用户id
   * @param money 余额
   */
  void deductMoney(Long userId, BigDecimal money);
}
