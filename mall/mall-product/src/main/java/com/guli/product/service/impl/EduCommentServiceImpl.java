package com.guli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.EduCommentDao;
import com.guli.product.entity.EduCommentEntity;
import com.guli.product.service.EduCommentService;


@Service("eduCommentService")
public class EduCommentServiceImpl extends ServiceImpl<EduCommentDao, EduCommentEntity> implements EduCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EduCommentEntity> page = this.page(
                new Query<EduCommentEntity>().getPage(params),
                new QueryWrapper<EduCommentEntity>()
        );

        return new PageUtils(page);
    }

}