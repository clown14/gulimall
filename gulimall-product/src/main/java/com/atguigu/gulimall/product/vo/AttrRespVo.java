package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @program: gulimall
 * @author: onion
 * @create: 2021-02-01 15:12
 **/

@Data
public class AttrRespVo extends AttrVo {
    //分类名，所属分组明
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}

    