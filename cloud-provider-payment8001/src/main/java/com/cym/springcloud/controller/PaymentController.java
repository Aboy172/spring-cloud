package com.cym.springcloud.controller;


import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.service.PaymentService;
import com.cym.springcloud.vo.CommonResult;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @Value("${spring.application.name}")
    private String serviceId;

    @Resource
    private DiscoveryClient discoveryClient;


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
            return new CommonResult<>(200,"查询成功  serverPort:"+serverPort,payment);
        }
        return new CommonResult<>(444,"查询不到"+id+"的记录");
    }
    @GetMapping("/payment/lb")
    public String paymentLb(){
        return serverPort;
    }

    @GetMapping("/payment/discovery")
    @ResponseBody
    public Object discovery ( ) {
        //获取服务
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info(element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t" +instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/feign/timeout")
    public String timeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return serverPort;

    }
    @GetMapping("/payment/zk")
    public String paymentZk() {
        return  "hello zk  serverPort:" +  this.serverPort;
    }



}
