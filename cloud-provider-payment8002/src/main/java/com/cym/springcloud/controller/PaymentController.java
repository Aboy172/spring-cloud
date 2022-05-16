package com.cym.springcloud.controller;


import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.service.PaymentService;
import com.cym.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author cym
 * @date 2022-05-04  23:32
 * @description 支付请求映射类
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    private CommonResult<Payment> create (@RequestBody Payment payment) {
        int createPaymentResult = paymentService.createPayment(payment);
        log.info("*******插入结果"+createPaymentResult);
        if (createPaymentResult > 0) {
            return new CommonResult<>(200,"插入数据库成功 serverPort:"+serverPort,createPaymentResult);
        }
        return new CommonResult<>(444,"插入数据库失败");

    }

    @GetMapping("/payment/get/{id}")
    private CommonResult<Payment> getPayment (@PathVariable("id") Long id) {
        Payment payment = paymentService.selectPaymentById(id);
        log.info("查询结果"+payment);
        if (payment != null) {
            return new CommonResult<>(200,"查询成功 serverPort:" + serverPort,payment);
        }
        return new CommonResult<>(444,"查询不到"+id+"的记录");
    }
    @GetMapping("/payment/lb")
    public String paymentLb(){
        return serverPort;
    }


}
