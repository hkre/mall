package com.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程科目
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@Data
@TableName("edu_subject")
public class EduSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 课程类别ID
	 */
	@TableId
	private Long id;
	/**
	 * 类别名称
	 */
	private String title;
	/**
	 * 父ID
	 */
	private String parentId;
	/**
	 * 排序字段
	 */
	private Integer sort;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 更新时间
	 */
	private Date gmtModified;

}
