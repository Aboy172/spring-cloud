package com.cym.springcloud.alibaba.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cym.springcloud.alibaba.domain.Account;
import com.cym.springcloud.alibaba.mapper.AccountMapper;
import com.cym.springcloud.alibaba.service.AccountService;
import java.math.BigDecimal;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
* @author cym
* @description 针对表【t_account(账户表)】的数据库操作Service实现
* @createDate 2022-05-15 20:07:58
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{
  @Resource
  private AccountMapper accountMapper;
  @Override
  public void deductMoney(Long userId, BigDecimal money) {
    UpdateWrapper<Account> wrapper = new UpdateWrapper<>();
    wrapper.eq("user_id",userId)
        .setSql("residue = residue - " + money)
        .setSql("used = used  +" + money);
    accountMapper.update(null,wrapper);
  }
}




