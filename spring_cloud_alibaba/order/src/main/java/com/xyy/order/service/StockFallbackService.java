package com.xyy.order.service;

import org.springframework.stereotype.Component;

/**
 * @author: zyf
 * @create: 2021-12-28 16:13
 **/
@Component
public class StockFallbackService implements StockService {
    @Override
    public String stock() {
        return "系统错误,进行降级处理";
    }
}
