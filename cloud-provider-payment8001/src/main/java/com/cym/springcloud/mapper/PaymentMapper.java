package com.cym.springcloud.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.cym.springcloud.entities.Payment;

/**
 * @author cym
 * @description 针对表【payment】的数据库操作Mapper
 * @createDate 2022-05-04 23:19:49
 * @Entity com.cym.springcloud.entities.Payment
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

    /**
     * 创建支付订单
     * @param payment 支付订单
     * @return 返回创建的订单数量
     */
    int createPayment(Payment payment);

    /**
     * 根据主键查找支付
     * @param id 主键id
     * @return 返回支付订单
     */
    Payment selectPaymentById (@Param("id") Long id);



}




