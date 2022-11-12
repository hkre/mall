package com.guli.ware.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;
import com.guli.ware.ware.dao.CrmBannerDao;
import com.guli.ware.ware.entity.CrmBannerEntity;
import com.guli.ware.ware.service.CrmBannerService;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("crmBannerService")
public class CrmBannerServiceImpl extends ServiceImpl<CrmBannerDao, CrmBannerEntity> implements CrmBannerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CrmBannerEntity> page = this.page(
                new Query<CrmBannerEntity>().getPage(params),
                new QueryWrapper<CrmBannerEntity>()
        );

        return new PageUtils(page);
    }

}