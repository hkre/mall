package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduSubjectDao;
import com.guli.product.entity.EduSubjectEntity;
import com.guli.product.service.EduSubjectService;


@Service("eduSubjectService")
public class EduSubjectServiceImpl extends ServiceImpl<EduSubjectDao, EduSubjectEntity> implements EduSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduSubjectEntity> page = this.page(
                new Query<EduSubjectEntity>().getPage(params),
                new QueryWrapper<EduSubjectEntity>()
        );

        return new PageUtils(page);
    }

}