package com.sy.practice.controller.domain;

import com.sy.practice.service.OrderService;
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
public class DomainTest {

    @Resource
    private OrderService orderService;

    @GetMapping("test1")
    public Object test1(){
        return orderService.selectByAll();
    }



}
