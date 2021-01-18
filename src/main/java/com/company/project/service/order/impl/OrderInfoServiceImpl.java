package com.company.project.service.order.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.company.project.mapper.order.OrderInfoMapper;
import com.company.project.entity.order.OrderInfoEntity;
import com.company.project.service.order.OrderInfoService;

import java.util.List;


/**
 * @Author HuangShiXing
 * @Description []
 * @Date  13:40 2021/1/18 0018
 **/
@Service("orderInfoService")
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfoEntity> implements OrderInfoService {

    private final OrderInfoMapper orderInfoMapper;

    public OrderInfoServiceImpl (OrderInfoMapper orderInfoMapper) {
        this.orderInfoMapper = orderInfoMapper;
    }

    @Override
    public List<OrderInfoEntity> queryAllOrderInfo () {
        return orderInfoMapper.queryAllOrderInfo ();
    }
}
