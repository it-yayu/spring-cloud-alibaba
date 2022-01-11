package com.xyy.order.service;

import com.xyy.common.api.ResponseMsg;
import com.xyy.order.service.dto.UserDto;


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
