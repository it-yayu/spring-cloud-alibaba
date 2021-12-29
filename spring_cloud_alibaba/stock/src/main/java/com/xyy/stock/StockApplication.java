package com.xyy.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zyf
 * @create: 2021-12-27 17:22
 **/
@SpringBootApplication
@MapperScan({"com.xyy.*.dao.mapper"})
public class StockApplication {
    public static void main(String[] args) {

        SpringApplication.run(StockApplication.class, args);


    }

}
