package com.xyy.order.service.dto;

import lombok.Data;

/**
 * @author: zyf
 * @create: 2022-01-05 18:10
 **/
@Data
public class UserDtoBack {
    private Integer id;

    private String username;

    private String name;

    private Integer organizationId;

    private String platformId;

    private String roleId;

    private String email;

    private String mobile;

    private Integer status;

    private Integer isLeader;

    private String role1;

    private String role2;

    private String role3;

    private String role4;

    private Integer isDel;
}
