package com.cym.springcloud.alibaba.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 账户表
 * @TableName t_account
 */
@TableName(value ="t_account")
@Data
public class Account implements Serializable {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private Integer total;

    /**
     * 已用余额
     */
    private Integer used;

    /**
     * 剩余可用额度
     */
    private Integer residue;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}