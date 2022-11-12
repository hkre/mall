package com.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评论
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@Data
@TableName("edu_comment")
public class EduCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 讲师ID
	 */
	@TableId
	private String id;
	/**
	 * 课程id
	 */
	private String courseId;
	/**
	 * 讲师id
	 */
	private String teacherId;
	/**
	 * 会员id
	 */
	private String memberId;
	/**
	 * 会员昵称
	 */
	private String nickname;
	/**
	 * 会员头像
	 */
	private String avatar;
	/**
	 * 评论内容
	 */
	private String content;
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
