package com.guli.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;
import com.guli.coupon.dao.TPayLogDao;
import com.guli.coupon.entity.TPayLogEntity;
import com.guli.coupon.service.TPayLogService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("tPayLogService")
public class TPayLogServiceImpl extends ServiceImpl<TPayLogDao, TPayLogEntity> implements TPayLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TPayLogEntity> page = this.page(
                new Query<TPayLogEntity>().getPage(params),
                new QueryWrapper<TPayLogEntity>()
        );

        return new PageUtils(page);
    }

}