package com.xyy.order.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;

/**
 * @author: zyf
 * @create: 2021-12-29 15:04
 **/
@Data
@TableName(value = "order_water")
@Builder
public class OrderWater extends Model<OrderWater> {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String number;
}
