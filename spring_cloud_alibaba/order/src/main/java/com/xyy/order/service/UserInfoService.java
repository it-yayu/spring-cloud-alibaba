package com.xyy.order.service;

import com.xyy.order.service.dto.UserDto;
import com.xyy.order.util.ResponseMsg;

/**
 * @author: zyf
 * @create: 2022-01-05 10:59
 **/
public interface UserInfoService {
    /**
     * 添加用户
     * @param userDto
     * @return
     */
    ResponseMsg addUser(UserDto userDto);

    /**
     * 分页查询用户
     * @param userDto
     * @return
     */
    ResponseMsg list(UserDto userDto);
}
