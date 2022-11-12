package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduTeacherEntity;

import java.util.Map;

/**
 * 讲师
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
public interface EduTeacherService extends IService<EduTeacherEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

