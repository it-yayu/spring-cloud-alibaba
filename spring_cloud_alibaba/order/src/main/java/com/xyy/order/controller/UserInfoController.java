package com.xyy.order.controller;

import com.xyy.order.service.UserInfoService;
import com.xyy.order.service.dto.UserDto;
import com.xyy.order.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author: zyf
 * @create: 2022-01-05 10:48
 **/
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping(value = "/list")
    @ResponseBody
    public ResponseMsg list(@RequestBody UserDto userDto) {
        return userInfoService.list(userDto);
    }




    @PostMapping(value = "/add")
    @ResponseBody
    public ResponseMsg addUser(@RequestBody @Valid UserDto userDto) {
        return userInfoService.addUser(userDto);
    }
}
