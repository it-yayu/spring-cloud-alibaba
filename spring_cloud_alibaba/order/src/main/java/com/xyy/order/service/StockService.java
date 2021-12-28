package com.xyy.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zyf
 * @create: 2021-12-28 10:14
 **/
@FeignClient(value = "stock-service")
public interface StockService {
    /**
     * 修改库存
     * @return
     */
    @GetMapping("/stock/one")
    String stock();
}
