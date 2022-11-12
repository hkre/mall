package com.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.order.entity.TOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:20:04
 */
public interface TOrderService extends IService<TOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

