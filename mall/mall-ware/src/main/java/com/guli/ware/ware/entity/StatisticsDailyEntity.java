package com.guli.ware.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 网站统计日数据
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:51:18
 */
@Data
@TableName("statistics_daily")
public class StatisticsDailyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 统计日期
	 */
	private String dateCalculated;
	/**
	 * 注册人数
	 */
	private Integer registerNum;
	/**
	 * 登录人数
	 */
	private Integer loginNum;
	/**
	 * 每日播放视频数
	 */
	private Integer videoViewNum;
	/**
	 * 每日新增课程数
	 */
	private Integer courseNum;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 更新时间
	 */
	private Date gmtModified;

}
