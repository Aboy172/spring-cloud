package com.cym.springcloud.alibaba.service;

import com.cym.springcloud.alibaba.domain.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author cym
* @description 针对表【t_storage(库存)】的数据库操作Service
* @createDate 2022-05-15 19:39:39
*/
public interface StorageService extends IService<Storage> {

  /**
   *  减指定的产品id的库存
   * @param productId
   * @param count
   */
  void decrease(Long productId, Integer count);
}
