package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduTeacherDao;
import com.guli.product.entity.EduTeacherEntity;
import com.guli.product.service.EduTeacherService;


@Service("eduTeacherService")
public class EduTeacherServiceImpl extends ServiceImpl<EduTeacherDao, EduTeacherEntity> implements EduTeacherService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduTeacherEntity> page = this.page(
                new Query<EduTeacherEntity>().getPage(params),
                new QueryWrapper<EduTeacherEntity>()
        );

        return new PageUtils(page);
    }

}