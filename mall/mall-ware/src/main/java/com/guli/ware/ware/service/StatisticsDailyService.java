package com.guli.ware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.ware.ware.entity.StatisticsDailyEntity;

import java.util.Map;

/**
 * 网站统计日数据
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:51:18
 */
public interface StatisticsDailyService extends IService<StatisticsDailyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

