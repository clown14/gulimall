package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: gulimall
 * @author: onion
 * @create: 2021-02-07 15:02
 **/

@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}


    