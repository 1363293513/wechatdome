package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirstVo implements Serializable {
    private String content;
    private String[] img;
    private List<VideoVo> video;

//
//    content: "好看，可以，不愧是专业的，才拿到手上就研究了半天才装上",
//    img: ["https://ae01.alicdn.com/kf/HTB1wREwTXzqK1RjSZFvq6AB7VXaT.jpg",
//            "https://ae01.alicdn.com/kf/HTB1sL7hTjDpK1RjSZFrq6y78VXaw.jpg",
//            "https://ae01.alicdn.com/kf/HTB111soTbvpK1RjSZPiq6zmwXXaB.jpg",
//            "https://ae01.alicdn.com/kf/HTB1O2TRTmzqK1RjSZPcq6zTepXa4.jpg"
//            ],
//    video: [{
//        img: "https://ae01.alicdn.com/kf/HTB1AMEBTcfpK1RjSZFOq6y6nFXaK.jpg",
//                path: "https://mp4.vjshi.com/2018-12-28/1083f3db90334f86e3fc3586b4472914.mp4"
//    }
//        ]
}
