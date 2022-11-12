package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduCourseDao;
import com.guli.product.entity.EduCourseEntity;
import com.guli.product.service.EduCourseService;


@Service("eduCourseService")
public class EduCourseServiceImpl extends ServiceImpl<EduCourseDao, EduCourseEntity> implements EduCourseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduCourseEntity> page = this.page(
                new Query<EduCourseEntity>().getPage(params),
                new QueryWrapper<EduCourseEntity>()
        );

        return new PageUtils(page);
    }

}