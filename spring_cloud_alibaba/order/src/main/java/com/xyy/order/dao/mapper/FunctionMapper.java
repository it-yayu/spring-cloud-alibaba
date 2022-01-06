package com.xyy.order.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyy.order.dao.pojo.Function;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: zyf
 * @create: 2022-01-05 14:23
 **/
@Repository
public interface FunctionMapper extends BaseMapper<Function> {
    /**
     * 插入功能
     * @param userId
     * @param permissions
     */
    void insertFun(@Param("userId") Integer userId,@Param("permissions") List<Integer> permissions);
}
