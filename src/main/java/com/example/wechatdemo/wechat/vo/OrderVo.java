package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVo implements Serializable {
    private String type;
    private Integer ordersn;
    private Integer goods_id;
    private String img;
    private String name;
    private String price;
    private Integer payment;
    private Integer freight;
    private String spec;
    private Integer numner;

//    type: "unpaid",
//    ordersn: 0,
//    goods_id: 0,
//    img: '/static/img/goods/p1.jpg',
//    name: '商品名称商品名称商品名称商品名称商品名称',
//    price: '168.00',
//    payment: 168.00,
//    freight: 12.00,
//    spec: '规格:S码',
//    numner: 1
}
