package com.cym.springcloud.alibaba.controller;

import com.cym.springcloud.alibaba.service.StorageService;
import com.cym.springcloud.vo.CommonResult;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-15  19:42
 * @description
 */
@RestController
public class StorageController {

  @Resource
  private StorageService storageService;

  /**
   * 减指定的产品id的库存
   * @param productId
   * @param count
   * @return
   */
  @PostMapping("/storage/decrease")
  CommonResult decrease(@RequestParam("productId") Long productId,
      @RequestParam("count") Integer count){
    storageService.decrease(productId, count);
    return new CommonResult(200,"减去产品id：" + productId + "的库存：" + count);
  }
}
