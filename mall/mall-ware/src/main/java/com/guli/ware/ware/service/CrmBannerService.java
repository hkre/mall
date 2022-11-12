package com.guli.ware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.ware.ware.entity.CrmBannerEntity;

import java.util.Map;

/**
 * 首页banner表
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:51:18
 */
public interface CrmBannerService extends IService<CrmBannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

