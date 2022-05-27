package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartGoodsVo implements Serializable {
    private Integer id;
    private String img;
    private String name;
    private String spec;
    private Double price;
    private Integer number;
    private Boolean selected;
}
