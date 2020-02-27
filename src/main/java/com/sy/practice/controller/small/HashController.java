package com.sy.practice.controller.small;

import com.sy.practice.utils.RedisUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author sy
 * Date: 2020/1/4 17:44
 * @Description
 */
@RestController
@RequestMapping("/hash")
public class HashController {


    @Resource
    private RedisUtil redisUtil;


    @GetMapping("/test1")
    public Object test1(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("1","壹");
        map.put("2","贰");
        map.put("3","叁");
        Object hget = redisUtil.hmset("user", map,122);
        System.out.println(hget);
        return redisUtil.hget("user");
    }


    @GetMapping("/test2")
    public Object test2(){
        return redisUtil.hget("user","1");
    }






}
