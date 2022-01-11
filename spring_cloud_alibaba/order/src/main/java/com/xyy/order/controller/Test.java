package com.xyy.order.controller;

import com.xyy.common.api.ResponseMsg;
import com.xyy.common.constant.CodeConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyf
 * @create: 2022-01-11 16:45
 **/
@RestController
@RequestMapping("/test")
public class Test {
    @GetMapping("/hello")
    public ResponseMsg test() {
        return new ResponseMsg(CodeConstant.SUCCESS, "hello");
    }
}
