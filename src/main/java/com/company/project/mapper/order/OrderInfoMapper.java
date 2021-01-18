package com.company.project.mapper.order;

import com.company.project.entity.order.OrderInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author SuperHero
 * @email *****@mail.com
 * @date 2021-01-13 19:03:34
 */
public interface OrderInfoMapper extends BaseMapper<OrderInfoEntity> {
	List<OrderInfoEntity> queryAllOrderInfo();
}
