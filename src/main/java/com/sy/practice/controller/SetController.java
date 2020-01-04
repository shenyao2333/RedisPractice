package com.sy.practice.controller;

import com.sy.practice.pojo.UserInfo;
import com.sy.practice.utils.RedisUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sy
 * Date: 2020/1/4 16:44
 * @Description
 */
@RestController
@RequestMapping("/set")
public class SetController {

    @Resource
    private RedisUtil redisUtil;


    @GetMapping("/test1")
    public void test1(){
        redisUtil.sSet("set","1","2","3");
        redisUtil.sSet("set1","1","2","3");
    }


}
