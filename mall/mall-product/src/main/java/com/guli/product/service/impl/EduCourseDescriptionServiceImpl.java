package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduCourseDescriptionDao;
import com.guli.product.entity.EduCourseDescriptionEntity;
import com.guli.product.service.EduCourseDescriptionService;


@Service("eduCourseDescriptionService")
public class EduCourseDescriptionServiceImpl extends ServiceImpl<EduCourseDescriptionDao, EduCourseDescriptionEntity> implements EduCourseDescriptionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduCourseDescriptionEntity> page = this.page(
                new Query<EduCourseDescriptionEntity>().getPage(params),
                new QueryWrapper<EduCourseDescriptionEntity>()
        );

        return new PageUtils(page);
    }

}