package com.xyy.stock.controller;

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
    @GetMapping("/one")
    public String stock() {
        System.out.println("库存减一");
        return "success";
    }
}
