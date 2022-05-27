package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;

public class Product implements Serializable {
    Integer goods_id;
    String img;
    String name;
    String price;
    String slogan;

    public Product(Integer goods_id, String img, String name, String price, String slogan) {
        this.goods_id = goods_id;
        this.img = img;
        this.name = name;
        this.price = price;
        this.slogan = slogan;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
