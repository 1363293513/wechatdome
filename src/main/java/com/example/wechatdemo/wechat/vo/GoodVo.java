package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodVo implements Serializable {
    Integer goods_id;
    String img;
    String name;
    String price;
    String slogan;
}
