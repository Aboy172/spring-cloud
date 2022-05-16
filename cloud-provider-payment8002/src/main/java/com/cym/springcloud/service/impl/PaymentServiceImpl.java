package com.cym.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cym.springcloud.entities.Payment;
import com.cym.springcloud.service.PaymentService;
import com.cym.springcloud.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author cym
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2022-05-04 23:19:49
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{


    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public int createPayment (Payment payment) {
        if (payment == null){
            return 0;
        }
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment selectPaymentById (Long id) {
        if (id == null){
            return null;
        }
        return paymentMapper.selectPaymentById(id);
    }
}




