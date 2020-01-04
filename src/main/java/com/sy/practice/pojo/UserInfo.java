package com.sy.practice.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sy
 * Date: 2020/1/4 16:44
 * @Description 测试对象
 */
@Data
public class UserInfo implements Serializable {


    private static final long serialVersionUID = 898161263510072702L;
    private String name;
    private String sex;
    private String hobby;
    private Integer age;

}
