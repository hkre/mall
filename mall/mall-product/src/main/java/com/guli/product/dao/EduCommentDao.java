package com.guli.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guli.product.entity.EduCommentEntity;
import org.apache.ibatis.annotations.Mapper;


/**
 * 评论
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@Mapper
public interface EduCommentDao extends BaseMapper<EduCommentEntity> {
	
}
