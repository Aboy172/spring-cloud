package com.cym.springcloud.alibaba.service;

import com.cym.springcloud.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cym
 * @description 针对表【t_storage(库存)】的数据库操作Service
 * @createDate 2022-05-15 18:34:30
 */
@FeignClient(value = "seata-storage-service")
public interface StorageServiceFeign {

  /**
   * 远程调用库存模块减库存
   * @param productId 产品id
   * @param count 库存
   * @return 返回json格式的结果数据集
   */
  @PostMapping("/storage/decrease")
  CommonResult decrease(@RequestParam("productId") Long productId,
      @RequestParam("count") Integer count);
}
