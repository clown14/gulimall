package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author clown
 * @email 785613198@qq.com
 * @date 2020-11-07 14:26:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
