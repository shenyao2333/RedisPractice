package com.sy.practice.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="com.sy.practice.domain.Order")
@Data
public class Order implements Serializable {
    @ApiModelProperty(value="null")
    private Integer id;

    @ApiModelProperty(value="null")
    private String orderNumber;

    @ApiModelProperty(value="null")
    private Double price;

    @ApiModelProperty(value="null")
    private String status;

    private static final long serialVersionUID = 1L;
}