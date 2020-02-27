package com.sy.practice.controller.small;

import com.sy.practice.utils.RedisUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sy
 * Date: 2020/1/4 18:05
 * @Description
 */
@RestController
@RequestMapping("/list")
public class ListController {

    @Resource
    private RedisUtil redisUtil;


    @GetMapping("/test1")
    public void test1(){
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        redisUtil.listSet("list",objects);
    }


    @GetMapping("/test2")
    public void test2(){
        List<Object> list = redisUtil.listGet("list", 0, -1);
        System.out.println(list);
    }

    @GetMapping("/test3")
    public Object test3(Long i){
        return redisUtil.listGetIndex("list",i);
    }



}
