package com.guli.ware.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;
import com.guli.ware.ware.dao.StatisticsDailyDao;
import com.guli.ware.ware.entity.StatisticsDailyEntity;
import com.guli.ware.ware.service.StatisticsDailyService;
import org.springframework.stereotype.Service;

import java.util.Map;




@Service("statisticsDailyService")
public class StatisticsDailyServiceImpl extends ServiceImpl<StatisticsDailyDao, StatisticsDailyEntity> implements StatisticsDailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StatisticsDailyEntity> page = this.page(
                new Query<StatisticsDailyEntity>().getPage(params),
                new QueryWrapper<StatisticsDailyEntity>()
        );

        return new PageUtils(page);
    }

}