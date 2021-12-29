package com.xyy.stock.controller;

import com.xyy.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyf
 * @create: 2021-12-27 17:40
 **/
@RequestMapping("/stock")
@RestController
public class Stock {
    @Autowired
    private StockService stockService;

    @GetMapping("/one")
    public String stock() {
        return stockService.reduction();
    }
}
