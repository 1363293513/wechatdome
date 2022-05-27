package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugsVo implements Serializable {
    private Integer id;
    private String title;
    private String banner;
    private List<SmallDrugs> list;


//    {       id: 1,
//            title: '家用电器',
//            banner: '/static/img/category/banner.jpg',
//            list: [
//                    { name: '冰箱', img: '1.jpg' },
//                    { name: '电视', img: '2.jpg' },
//                    { name: '空调', img: '3.jpg' },
//                    { name: '洗衣机', img: '4.jpg' },
//                    { name: '风扇', img: '5.jpg' },
//                    { name: '燃气灶', img: '6.jpg' },
//                    { name: '热水器', img: '7.jpg' },
//                    { name: '电吹风', img: '8.jpg' },
//                    { name: '电饭煲', img: '9.jpg' }
//                    ]
//    }
}

