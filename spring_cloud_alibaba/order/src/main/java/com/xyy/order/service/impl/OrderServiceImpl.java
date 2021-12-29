package com.xyy.order.service.impl;

import com.xyy.order.dao.mapper.OrderMapper;
import com.xyy.order.dao.pojo.OrderWater;
import com.xyy.order.service.OrderService;
import com.xyy.order.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zyf
 * @create: 2021-12-29 14:51
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StockService stockService;

    @Override
    public String makeOrder() {
        System.out.println("开始创建订单");
        orderMapper.insert(OrderWater.builder().number("123").build());
        return  stockService.stock();
    }
}
