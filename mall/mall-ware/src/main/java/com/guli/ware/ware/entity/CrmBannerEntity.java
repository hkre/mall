package com.guli.ware.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 首页banner表
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:51:18
 */
@Data
@TableName("crm_banner")
public class CrmBannerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private String id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 图片地址
	 */
	private String imageUrl;
	/**
	 * 链接地址
	 */
	private String linkUrl;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 逻辑删除 1（true）已删除， 0（false）未删除
	 */
	private Integer isDeleted;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 更新时间
	 */
	private Date gmtModified;

}
