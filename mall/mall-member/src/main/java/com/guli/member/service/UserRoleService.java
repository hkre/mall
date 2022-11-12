package com.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.member.entity.UserRoleEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
public interface UserRoleService extends IService<UserRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

