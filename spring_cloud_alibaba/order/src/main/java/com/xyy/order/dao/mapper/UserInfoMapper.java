package com.xyy.order.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyy.order.dao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: zyf
 * @create: 2022-01-05 11:16
 **/
@ResponseBody
@Component
public interface UserInfoMapper extends BaseMapper<User> {
    /**
     * 查询用户
     * @param data
     * @param page
     * @return
     */
    IPage<User> list(@Param("data") String data, Page<User> page);
}
