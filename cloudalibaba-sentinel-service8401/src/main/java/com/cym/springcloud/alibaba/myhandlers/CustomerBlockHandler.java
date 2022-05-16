package com.cym.springcloud.alibaba.myhandlers;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cym.springcloud.vo.CommonResult;

/**
 * @author cym
 * @date 2022-05-14  18:34
 * @description
 */
public class CustomerBlockHandler {
  public static CommonResult customerBlockException(BlockException exception){
    return new CommonResult(444, "按客户自定义的，global handlerException--------1");

  }

  public static CommonResult customerBlockException2(BlockException exception){
    return new CommonResult(444, "按客户自定义的，global handlerException--------2");

  }
}
