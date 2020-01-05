package com.sy.practice.controller;

import com.sy.practice.domain.UserInfo;
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
@RequestMapping("/string")
public class StringController {

    @Resource
    private RedisUtil redisUtil;


    @GetMapping("/test1")
    public void test1(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(1);
        userInfo.setHobby("我爱记笔记");
        userInfo.setName("小明");
        redisUtil.set("userinfo",userInfo);
    }


    @GetMapping("/test2")
    public Object test2(){
        UserInfo userinfo =(UserInfo) redisUtil.get("userinfo");
        String hobby = userinfo.getHobby();
        System.out.println("测试打印兴趣爱好："+hobby);
        return userinfo;
    }


    /**
     * 测试自增长
     */
    @GetMapping("/test3")
    public void test3(){
        redisUtil.set("jian",1);
    }

    @GetMapping("/test4")
    public Object test4(){
        redisUtil.incr("jian",2);
        return redisUtil.get("jian");
    }


    /**
     * 测试分布式锁
     * @return
     */
    @GetMapping("/test5")
    public Object test5() throws InterruptedException {
        boolean san = redisUtil.setNx("3", "san", 120);
        for (int i = 0 ;i<1000;i++){
            System.out.println("加锁的："+i);
            Thread.sleep(200);
            if (i==50){
                System.out.println("放锁："+i);
                redisUtil.delete("3","san");
                return i;
            }
        }
        return san;
    }

    @GetMapping("/test6")
    public Object test6() throws InterruptedException {
        int i =0;
        boolean san;
       do{
           i++;
           Thread.sleep(100);
           san = redisUtil.setNx("3", "san", 120);
           System.out.println("第 "+i+ " 次拿锁。状态："+san);
       }while (!san);
        System.out.println("第 "+i+ " 次拿到了锁。状态："+san);
        return i;
    }









}
