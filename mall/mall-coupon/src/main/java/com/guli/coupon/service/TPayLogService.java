package com.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.coupon.entity.TPayLogEntity;

import java.util.Map;

/**
 * 支付日志表
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:22:52
 */
public interface TPayLogService extends IService<TPayLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

