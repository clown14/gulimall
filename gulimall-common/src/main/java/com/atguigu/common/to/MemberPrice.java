package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: gulimall
 * @author: onion
 * @create: 2021-02-06 16:31
 **/

@Data
public class MemberPrice {
    private Long id;
    private String name;
    private BigDecimal price;
}

    