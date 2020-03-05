package com.sy.practice.controller.domain;

import com.sy.practice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * </p>
 *
 * @author ：sy
 * @date ：Created in 2020.2.27 22:26
 * @version:
 */
@RestController
@RequestMapping("/do")
@Slf4j
public class DomainTest {

    @Resource
    private OrderService orderService;

    @GetMapping("test1")
    public Object test1(){
        return orderService.selectByAll();
    }

    @GetMapping("/test2")
    public Object test2(Integer id){
        return orderService.selectByPrimaryKey(id);
    }

    @GetMapping("/test3")
    @Cacheable(value = "test",key = "#i")
    public Object test3(int i){
        log.info("---进来了---");
        return i;
    }

    @GetMapping("/test4")
    @Cacheable(value = "test4")
    public Object test4(int i){
        log.info("---进来了---");
        return i;
    }

    @GetMapping("/test5")
    @Cacheable(value = "test")
    public Object test5(int i){
        log.info("---进来了---");
        return i;
    }

    @GetMapping("/test6")
    @Cacheable(value = "test",key = "#i")
    public Object test6(int i){
        log.info("---进来了---");
        return i;
    }




}
