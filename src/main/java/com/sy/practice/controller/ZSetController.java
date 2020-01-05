package com.sy.practice.controller;

import com.sy.practice.domain.UserInfo;
import com.sy.practice.utils.RedisUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

/**
 * <p>
 * </p>
 *
 * @author ：sy
 * @date ：Created in 2020.1.5 17:40
 * @version:
 */
@RestController
@RequestMapping("/zSet")
public class ZSetController {

    @Resource
    private RedisUtil redisUtil;


    @GetMapping("/test1")
    public void test1(){
       redisUtil.zSetAdd("zset","张三",33);
        redisUtil.zSetAdd("zset","李四",445);
        redisUtil.zSetAdd("zset","王五",534);
        redisUtil.zSetAdd("zset","赵六",145);
        redisUtil.zSetAdd("zset","田七",131);
        redisUtil.zSetAdd("zset","朱八",1135);
    }
    @GetMapping("/test2")
    public Object test2(){
        return redisUtil.zRange("zset", 0, -1);
    }

    @GetMapping("/test3")
    public Object test3(){
        return redisUtil.zRangeWithScores("zset", 0, -1);
    }

}
