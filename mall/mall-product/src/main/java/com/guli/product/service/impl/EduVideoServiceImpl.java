package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduVideoDao;
import com.guli.product.entity.EduVideoEntity;
import com.guli.product.service.EduVideoService;


@Service("eduVideoService")
public class EduVideoServiceImpl extends ServiceImpl<EduVideoDao, EduVideoEntity> implements EduVideoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduVideoEntity> page = this.page(
                new Query<EduVideoEntity>().getPage(params),
                new QueryWrapper<EduVideoEntity>()
        );

        return new PageUtils(page);
    }

}