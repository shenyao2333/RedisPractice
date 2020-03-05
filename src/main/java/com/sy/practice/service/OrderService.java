package com.sy.practice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sy.practice.domain.Order;
import com.sy.practice.mapper.OrderMapper;
@Service
@Slf4j
public class OrderService{

    @Resource
    private OrderMapper orderMapper;


    public int deleteByPrimaryKey(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }


    public int insert(Order record) {
        return orderMapper.insert(record);
    }


    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }


    public Order selectByPrimaryKey(Integer id) {
        log.debug("0-->");
        return orderMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }


    public Object selectByAll(){
        Order order = new Order();
        return orderMapper.selectByAll(order);
    }



}
