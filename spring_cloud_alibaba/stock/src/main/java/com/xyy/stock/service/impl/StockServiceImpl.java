package com.xyy.stock.service.impl;

import com.xyy.stock.dao.mapper.StockMapper;
import com.xyy.stock.dao.pojo.StockNum;
import com.xyy.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zyf
 * @create: 2021-12-29 15:14
 **/
@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockMapper stockMapper;
    @Override
    public String reduction() {
        StockNum stock = stockMapper.selectById(1);
        stock.setNumber(stock.getNumber()-1);
        stockMapper.updateById(stock);
        System.out.println("库存减1");
        return "删减库存成功";
    }
}
