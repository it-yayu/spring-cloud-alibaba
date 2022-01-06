package com.xyy.order.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import feign.Client;
import lombok.Data;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * @author: zyf
 * @create: 2022-01-05 11:16
 **/
@Data
@TableName(value = "common_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String name;

    private String password;


    private Integer organizationId;

    private String platformId;


    private String roleId;


    private String email;

    private String mobile;

    private byte status;

    private String secret;

    private Integer isLeader;

    @TableField(exist = false)
    private List<Integer> permissions;

    private Integer isDel;
}
