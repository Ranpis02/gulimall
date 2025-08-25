package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author Zhihong_Xie
 * @email ranpis02@gmail.com
 * @date 2025-08-24 20:02:51
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
