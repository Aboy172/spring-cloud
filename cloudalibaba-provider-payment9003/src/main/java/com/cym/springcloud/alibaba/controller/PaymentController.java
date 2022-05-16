package com.cym.springcloud.alibaba.controller;

import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.vo.CommonResult;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-14  18:54
 * @description
 */
@RestController
public class PaymentController {
  @Value("${server.port}")
  private String serverPort;
  public static HashMap<Long, Payment> map = new HashMap<>();

  static {
    map.put(1L,new Payment(1L,"0ed88fa1-263f-4963-88df-b7443ac3df2a"));
    map.put(2L,new Payment(2L,"23256b3b-809f-4318-b2bc-2926e734ec78"));
    map.put(3L,new Payment(3L,"b2905fa2-fd9c-4ba4-9e0d-57762f797a6b"));
  }
  @GetMapping("/payment/{id}")
  public CommonResult<Payment> paymentForMySql(@PathVariable("id") Long id){
    Payment payment = map.get(id);
    return new CommonResult<>(200,
        "form mysql" + "serverPort:" + serverPort, payment);
  }

}
