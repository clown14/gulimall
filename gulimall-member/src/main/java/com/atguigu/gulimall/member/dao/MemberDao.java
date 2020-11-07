package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author clown
 * @email 785613198@qq.com
 * @date 2020-11-07 14:36:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
