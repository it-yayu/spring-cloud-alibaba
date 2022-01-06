package com.xyy.order.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: zyf
 * @create: 2022-01-05 14:21
 **/
@Data
@TableName
public class Function {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer roleId;

    private Integer functionId;

    private Integer userId;

    private Integer functionPid;

}
