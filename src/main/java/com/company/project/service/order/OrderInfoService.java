package com.company.project.service.order;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.entity.order.OrderInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author SuperHero
 * @email *****@mail.com
 * @date 2021-01-13 19:03:34
 */
public interface OrderInfoService extends IService<OrderInfoEntity> {
    List<OrderInfoEntity> queryAllOrderInfo();
}

