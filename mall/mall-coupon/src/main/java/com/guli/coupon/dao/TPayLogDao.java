package com.guli.coupon.dao;

import com.guli.coupon.entity.TPayLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付日志表
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:22:52
 */
@Mapper
public interface TPayLogDao extends BaseMapper<TPayLogEntity> {
	
}
