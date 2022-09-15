package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiong
 * @email 1351655382@qq.com
 * @date 2022-09-15 14:11:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
