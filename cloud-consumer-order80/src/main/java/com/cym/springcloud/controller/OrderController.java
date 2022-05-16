package com.cym.springcloud.controller;

import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.vo.CommonResult;
import com.cym.springcloud.vo.CommonResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author cym
 * @date 2022-05-05  02:16
 * @description order请求映射类
 */
@RestController
@Slf4j
public class OrderController {

  private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/create")
  public CommonResult createPayment(@RequestBody Payment payment) {
    return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);

  }

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult getPayment(@PathVariable("id") Long id) {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
  }

    @GetMapping("/consumer/payment/getForEntity/{id}")
  public CommonResult getPayment2(@PathVariable("id") Long id) {
    ResponseEntity<CommonResult> entity = restTemplate.getForEntity(
        PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    if (entity.getStatusCode().is2xxSuccessful()){
      return entity.getBody();
    }
    return CommonResult.error(CommonResultEnum.DB_SELECT_ERROR);
  }
  @GetMapping("/consumer/payment/zk")
  public String paymentZk(){
    return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
  }



}
