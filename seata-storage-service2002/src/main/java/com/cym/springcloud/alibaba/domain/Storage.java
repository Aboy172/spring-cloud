package com.cym.springcloud.alibaba.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 库存
 * @TableName t_storage
 */
@TableName(value ="t_storage")
@Data
public class Storage implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private BigDecimal total;

    /**
     * 已用库存
     */
    private BigDecimal used;

    /**
     * 剩余库存
     */
    private BigDecimal residue;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}