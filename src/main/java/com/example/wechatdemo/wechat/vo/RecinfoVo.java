package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecinfoVo implements Serializable {
    private Integer id;
    private String name;
    private String head;
    private String tel;
    private AddressVo address;
    private Boolean isDefault;

//    recinfo: {
//        id: 1,
//                name: "上帝爱裸睡",
//                head: "大",
//                tel: "18816881688",
//                address: {
//            region: {
//                "label": "广东省-深圳市-南山区", "value": [18, 2, 1], "cityCode": "440304"
//            },
//            detailed: '粤海街道1111号无名摩登大厦6楼A2'
//        },
//        isDefault: true
//    }
}
