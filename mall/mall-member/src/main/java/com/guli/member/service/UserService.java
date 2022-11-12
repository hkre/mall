package com.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.member.entity.UserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

