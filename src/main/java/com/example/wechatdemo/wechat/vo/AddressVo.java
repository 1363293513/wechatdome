package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressVo implements Serializable {
    private RegionVo region;
    private String detailed;


//    address: {
//        region: {
//            "label": "广东省-深圳市-南山区",
//                    "value": [18, 2, 1],
//            "cityCode": "440304"
//        },
//        detailed: '粤海街道1111号无名摩登大厦6楼A2'
//    },
}
