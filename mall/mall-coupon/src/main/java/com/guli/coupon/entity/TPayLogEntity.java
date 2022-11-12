package com.guli.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付日志表
 * 
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:22:52
 */
@Data
@TableName("t_pay_log")
public class TPayLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 支付完成时间
	 */
	private Date payTime;
	/**
	 * 支付金额（分）
	 */
	private BigDecimal totalFee;
	/**
	 * 交易流水号
	 */
	private String transactionId;
	/**
	 * 交易状态
	 */
	private String tradeState;
	/**
	 * 支付类型（1：微信 2：支付宝）
	 */
	private Integer payType;
	/**
	 * 其他属性
	 */
	private String attr;
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
