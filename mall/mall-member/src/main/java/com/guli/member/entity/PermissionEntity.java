package com.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 权限
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
@Data
@TableName("acl_permission")
public class PermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 所属上级
	 */
	private String pid;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 类型(1:菜单,2:按钮)
	 */
	private Integer type;
	/**
	 * 权限值
	 */
	private String permissionValue;
	/**
	 * 访问路径
	 */
	private String path;
	/**
	 * 组件路径
	 */
	private String component;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 状态(0:禁止,1:正常)
	 */
	private Integer status;
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
