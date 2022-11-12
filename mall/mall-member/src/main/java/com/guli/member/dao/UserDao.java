package com.guli.member.dao;

import com.guli.member.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
