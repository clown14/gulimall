package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author clown
 * @email 785613198@qq.com
 * @date 2020-11-06 15:25:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
