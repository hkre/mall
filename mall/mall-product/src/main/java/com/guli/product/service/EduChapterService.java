package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduChapterEntity;

import java.util.Map;

/**
 * 课程
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
public interface EduChapterService extends IService<EduChapterEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

