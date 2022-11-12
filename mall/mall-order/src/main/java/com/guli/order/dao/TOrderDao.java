package com.guli.order.dao;

import com.guli.order.entity.TOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:20:04
 */
@Mapper
public interface TOrderDao extends BaseMapper<TOrderEntity> {
	
}
