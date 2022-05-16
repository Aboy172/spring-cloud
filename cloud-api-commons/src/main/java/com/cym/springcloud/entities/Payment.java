package com.cym.springcloud.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @author cym
 * @TableName payment
 */
@Data
@AllArgsConstructor
public class Payment implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String serial;

    private static final long serialVersionUID = 1L;
}