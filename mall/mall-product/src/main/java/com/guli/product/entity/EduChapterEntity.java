package com.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 课程
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@Data
@TableName("edu_chapter")
public class EduChapterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 章节ID
	 */
	@TableId
	private String id;
	/**
	 * 课程ID
	 */
	private String courseId;
	/**
	 * 章节名称
	 */
	private String title;
	/**
	 * 显示排序
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
