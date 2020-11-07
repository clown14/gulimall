package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author clown
 * @email 785613198@qq.com
 * @date 2020-11-07 14:38:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
