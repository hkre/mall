package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduVideoEntity;

import java.util.Map;

/**
 * 课程视频
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
public interface EduVideoService extends IService<EduVideoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

