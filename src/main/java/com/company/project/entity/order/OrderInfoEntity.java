package com.company.project.entity.order;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.company.project.entity.system.BaseEntity;


import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 *
 *
 * @author SuperHero
 * @email *****@mail.com
 * @date 2021-01-13 19:03:34
 */
@Data
@TableName("cw_order_info")
public class OrderInfoEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId("id")
	private Long id;

	/**
	 * 订单编号
	 */
	@TableField("order_no")
	private String orderNo;

	/**
	 * 物料编号
	 */
	@TableField("material_no")
	private String materialNo;

	/**
	 * 组数
	 */
	@TableField("groups_number")
	private Integer groupsNumber;

	/**
	 * 只数
	 */
	@TableField("unit_number")
	private Integer unitNumber;

	/**
	 * 收获地址
	 */
	@TableField("receipt_address")
	private String receiptAddress;

	/**
	 * 详细地址
	 */
	@TableField("detailed_address")
	private String detailedAddress;

	/**
	 * 产品类型
	 */
	@TableField("product_type")
	private String productType;

	/**
	 * 销售型号
	 */
	@TableField("sales_model")
	private String salesModel;

	/**
	 * 专用纸箱描述
	 */
	@TableField("carton_description")
	private String cartonDescription;

	/**
	 * 客户类型
	 */
	@TableField("customer_type")
	private String customerType;

	/**
	 * 营销渠道
	 */
	@TableField("marketing_channel")
	private String marketingChannel;

	/**
	 * 交货日期
	 */
	@TableField("delivery_date")
	private Date deliveryDate;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@TableField("update_time")
	private Date updateTime;

	/**
	 * 创建人
	 */
	@TableField("create_by")
	private String createBy;

	/**
	 * 修改人
	 */
	@TableField("update_by")
	private String updateBy;

	/**
	 * 是否删除(1未删除；0已删除)
	 */
	@TableField("deleted")
	private Integer deleted;


}
