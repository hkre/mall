package com.guli.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.order.dao.TOrderDao;
import com.guli.order.entity.TOrderEntity;
import com.guli.order.service.TOrderService;


@Service("tOrderService")
public class TOrderServiceImpl extends ServiceImpl<TOrderDao, TOrderEntity> implements TOrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TOrderEntity> page = this.page(
                new Query<TOrderEntity>().getPage(params),
                new QueryWrapper<TOrderEntity>()
        );

        return new PageUtils(page);
    }

}