package com.sy.practice.controller.small;

import com.sy.practice.utils.RedisUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * </p>
 *
 * @author ：sy
 * @date ：Created in 2020.1.3 22:24
 * @version:
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/test1")
    public String test1(){
        System.out.println("---");
        boolean set = redisUtil.set("123","测试的");
        return "成功";
    }

    @GetMapping("/test2")
    public String test2(){
        return redisUtil.get("123").toString();
    }



}
