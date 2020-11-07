package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author clown
 * @email 785613198@qq.com
 * @date 2020-11-07 14:38:54
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
