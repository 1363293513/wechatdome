package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionVo implements Serializable {
    private String label;
    private Integer[] value;
    private String cityCode;

//    region: {
//        "label": "广东省-深圳市-南山区",
//                "value": [18, 2, 1],
//        "cityCode": "440304"
//    },
}
