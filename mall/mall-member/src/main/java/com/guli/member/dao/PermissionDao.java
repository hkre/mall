package com.guli.member.dao;

import com.guli.member.entity.PermissionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
@Mapper
public interface PermissionDao extends BaseMapper<PermissionEntity> {
	
}
