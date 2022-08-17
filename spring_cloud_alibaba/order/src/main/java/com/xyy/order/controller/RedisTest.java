package com.xyy.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author yayu
 * @title: RedisTest
 * @description: TODO
 * @date 2022/1/9 12:16
 */
@RestController
@RequestMapping("/redis")
public class RedisTest {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @GetMapping("/set")
    public Set getSet() {
        redisTemplate.opsForSet().add("setList", "1,2", "22", "3");
        return redisTemplate.opsForSet().members("setList");
    }

    @GetMapping("/list")
    public List getList() {
        redisTemplate.delete("list");
        redisTemplate.opsForList().leftPush("list", "1", TimeUnit.HOURS);
        redisTemplate.opsForList().leftPush("list", "2");
        redisTemplate.opsForList().leftPush("list", "3");
        return  redisTemplate.opsForList().range("list",0,-1);
    }

}
