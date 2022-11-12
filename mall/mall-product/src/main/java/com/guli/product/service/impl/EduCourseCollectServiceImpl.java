package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduCourseCollectDao;
import com.guli.product.entity.EduCourseCollectEntity;
import com.guli.product.service.EduCourseCollectService;


@Service("eduCourseCollectService")
public class EduCourseCollectServiceImpl extends ServiceImpl<EduCourseCollectDao, EduCourseCollectEntity> implements EduCourseCollectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduCourseCollectEntity> page = this.page(
                new Query<EduCourseCollectEntity>().getPage(params),
                new QueryWrapper<EduCourseCollectEntity>()
        );

        return new PageUtils(page);
    }

}