package com.sy.practice.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.sy.practice.domain.Order;
import org.mapstruct.Mapper;
import org.springframework.cache.annotation.Cacheable;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    @Cacheable(value = "order", key = "#id")
    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    @Cacheable(value = "order", key = "123")
    List<Order> selectByAll(Order order);





}
