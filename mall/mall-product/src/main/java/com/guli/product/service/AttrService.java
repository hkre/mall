package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-13 20:05:14
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

