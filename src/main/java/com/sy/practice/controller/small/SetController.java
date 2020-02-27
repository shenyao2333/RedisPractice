package com.sy.practice.controller.small;

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
        long set = redisUtil.sSet("set", "1", "2", "3");
        long set1 = redisUtil.sSet("set1", "1", "2", "3");
    }

    @GetMapping("/test2")
    public Object test2(){
        return redisUtil.getSetIs("set","1");
    }

    /**
     * 测试set去重功能。
     * @return
     */
    @GetMapping("/test3")
    public Object test3(){
        long set = redisUtil.sSet("set", "1");
        if (set>0){
            return "添加成功";
        }
        return "添加失败";
    }



}
