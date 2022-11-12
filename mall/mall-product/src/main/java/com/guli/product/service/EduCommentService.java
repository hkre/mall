package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduCommentEntity;

import java.util.Map;

/**
 * 评论
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
public interface EduCommentService extends IService<EduCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

