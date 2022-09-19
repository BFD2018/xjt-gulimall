package com.atguigu.gulimall.product.entity;

import com.atguigu.common.validator.AddGroup;
import com.atguigu.common.validator.ListValue;
import com.atguigu.common.validator.UpdateGroup;
import com.atguigu.common.validator.UpdateStatusGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author xiong
 * @email 1351655382@qq.com
 * @date 2022-09-07 21:22:28
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@Null(message = "新增时id为空",groups = AddGroup.class)
	@NotNull(message = "更新brand时id不能为空",groups = UpdateGroup.class)
	@TableId
	private Long brandId;

	/**
	 * 品牌名,新增修改时都不能为空
	 */
	@NotBlank(message = "品牌名不能为空",groups = {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotBlank(groups = {AddGroup.class})
	@URL(message = "logo必须是一个合法的url地址",groups = {AddGroup.class,UpdateGroup.class})
	private String logo;

	/**
	 * 介绍
	 */
	private String descript;

	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
	@ListValue(values = {0, 1},groups = {AddGroup.class, UpdateStatusGroup.class})
	private Integer showStatus;

	/**
	 * 检索首字母
	 */
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母",groups = {AddGroup.class,UpdateGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(groups = {AddGroup.class})
	@Min(value = 0, message = "排序必须大于等于0",groups = {AddGroup.class,UpdateGroup.class})
	private Integer sort;
}
