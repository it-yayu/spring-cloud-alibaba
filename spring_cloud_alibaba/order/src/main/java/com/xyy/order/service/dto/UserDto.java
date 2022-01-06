package com.xyy.order.service.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * @author: zyf
 * @create: 2022-01-05 10:52
 **/
@Data
public class UserDto extends BaseDto{

    private Integer id;
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = "^[\\u2E80-\\u9FFF_a-zA-Z0-9]{2,10}$", message = "用户名称不符合规范")
    private String username;

    @NotBlank(message = "姓名不能为空")
    @Pattern(regexp = "^[\\u2E80-\\u9FFF]{2,10}$", message = "姓名不符合规范")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;


    private Integer organizationId;

    @NotBlank(message = "平台信息不能为空")
    private String platformId;


    @NotBlank(message = "角色信息不能为空")
    private String roleId;

    @NotBlank(message = "邮件地址不能为空")
    @Email(message = "邮件格式不正确")
    private String email;

    @NotBlank(message = "联系方式不能为空")
    private String mobile;

    private byte status;


    private Integer isLeader;


    private List<Integer> permissions;

    private String data;






}
