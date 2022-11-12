package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduChapterDao;
import com.guli.product.entity.EduChapterEntity;
import com.guli.product.service.EduChapterService;


@Service("eduChapterService")
public class EduChapterServiceImpl extends ServiceImpl<EduChapterDao, EduChapterEntity> implements EduChapterService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduChapterEntity> page = this.page(
                new Query<EduChapterEntity>().getPage(params),
                new QueryWrapper<EduChapterEntity>()
        );

        return new PageUtils(page);
    }

}