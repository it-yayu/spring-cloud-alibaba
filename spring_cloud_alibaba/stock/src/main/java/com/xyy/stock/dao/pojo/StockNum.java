package com.xyy.stock.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;

/**
 * @author: zyf
 * @create: 2021-12-29 15:18
 **/
@Data
@TableName(value = "stock_num")
@Builder
public class StockNum extends Model<StockNum> {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer number;

}
