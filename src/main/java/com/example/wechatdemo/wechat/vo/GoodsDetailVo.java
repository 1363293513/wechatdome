package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDetailVo implements Serializable {
    private Integer id;
    private String name;
    private String price;
    private Long number;
    private List<ServiceVo> service;
    private String[] spec;
    private CommentVo comment;
}
