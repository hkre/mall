package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduCourseDescriptionEntity;

import java.util.Map;

/**
 * 课程简介
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
public interface EduCourseDescriptionService extends IService<EduCourseDescriptionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

