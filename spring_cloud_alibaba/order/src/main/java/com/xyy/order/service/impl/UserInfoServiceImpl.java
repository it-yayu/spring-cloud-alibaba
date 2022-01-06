package com.xyy.order.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyy.order.dao.mapper.FunctionMapper;
import com.xyy.order.dao.mapper.UserInfoMapper;
import com.xyy.order.dao.pojo.User;
import com.xyy.order.service.UserInfoService;
import com.xyy.order.service.dto.UserDto;
import com.xyy.order.service.dto.UserDtoBack;
import com.xyy.order.util.CodeConstant;
import com.xyy.order.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * @author: zyf
 * @create: 2022-01-05 11:00
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private FunctionMapper functionMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseMsg addUser(UserDto userDto) {
        User user = BeanUtil.toBean(userDto, User.class);
        int count = existPhone(user.getMobile());
        if (count > 0) {
            return new ResponseMsg(CodeConstant.FAIL, "手机号已经存在！", userDto.getMobile());
        }
        user.setSecret(IdUtil.simpleUUID());
        String pass = SecureUtil.md5(userDto.getPassword() + user.getSecret());
        user.setPassword(pass);
        user.setIsDel(1);
        userInfoMapper.insert(user);
        if (CollUtil.isNotEmpty(userDto.getPermissions())) {
            functionMapper.insertFun(user.getId(), userDto.getPermissions());
        }
        return ResponseMsg.success();
    }

    @Override
    public ResponseMsg list(UserDto userDto) {
        Page<User> page = new Page<>(userDto.getPageNo(), userDto.getPageSize());
        IPage<User> list = userInfoMapper.list(userDto.getData(), page);
        List<User> items = list.getRecords();
        List<UserDtoBack> resultList = new ArrayList<>();
        Optional.ofNullable(items).orElse(new ArrayList<>()).forEach(item -> {
            UserDtoBack userDtoBack = BeanUtil.toBean(item, UserDtoBack.class);
            String[] split = item.getPlatformId().split(",");
            if (userDtoBack.getPlatformId().contains("1")) {
                String roleId = getRoleId(split, "1", userDtoBack);
                userDtoBack.setRole1(roleId);
            }
            if (userDtoBack.getPlatformId().contains("2")) {
                String roleId = getRoleId(split, "2", userDtoBack);
                userDtoBack.setRole2(roleId);
            }
            if (userDtoBack.getPlatformId().contains("3")) {
                String roleId = getRoleId(split, "3", userDtoBack);
                userDtoBack.setRole3(roleId);
            }
            if (userDtoBack.getPlatformId().contains("4")) {
                String roleId = getRoleId(split, "4", userDtoBack);
                userDtoBack.setRole4(roleId);
            }

            resultList.add(userDtoBack);
        });

        HashMap<String, Object> map = new HashMap(16);
        //页大小
        map.put("pageSize", userDto.getPageSize());

        //页码
        map.put("pageNo", userDto.getPageNo());

        //数据结果集合
        map.put("dataList", resultList);

        //总页数
        map.put("totalPage", list.getPages());

        //总记录数
        map.put("totalRecord", list.getTotal());

        return new ResponseMsg(CodeConstant.SUCCESS, CodeConstant.SUCCESS_DESC, map);
    }

    private String getRoleId(String[] data, String platformId, UserDtoBack userDtoBack) {
        int i = ArrayUtil.indexOf(data, platformId);
        String s = userDtoBack.getRoleId().split(",")[i];
        return s;
    }


    public int existPhone(String mobile) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.hasText(mobile), "mobile", mobile).eq("is_del", 1);
        return userInfoMapper.selectCount(wrapper);
    }

}
