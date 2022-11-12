package com.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.member.entity.PermissionEntity;

import java.util.Map;

/**
 * 权限
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
public interface PermissionService extends IService<PermissionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

