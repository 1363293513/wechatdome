package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodCommentVo implements Serializable {
    private Integer id;
    private String username;
    private String face;
    private String date;
    private String spec;
    private String grade;
    private FirstVo first;
    private AppendVo append;

//    id: 1,
//    username: "大黑哥",
//    face: "/static/img/face.jpg",
//    date: '2019-04-21',
//    spec: "规格: XL",
//    grade: "good",
//    first: {
//        content: "好看，可以，不愧是专业的，才拿到手上就研究了半天才装上",
//                img: ["https://ae01.alicdn.com/kf/HTB1wREwTXzqK1RjSZFvq6AB7VXaT.jpg",
//                "https://ae01.alicdn.com/kf/HTB1sL7hTjDpK1RjSZFrq6y78VXaw.jpg",
//                "https://ae01.alicdn.com/kf/HTB111soTbvpK1RjSZPiq6zmwXXaB.jpg",
//                "https://ae01.alicdn.com/kf/HTB1O2TRTmzqK1RjSZPcq6zTepXa4.jpg"
//          ],
//        video: [{
//            img: "https://ae01.alicdn.com/kf/HTB1AMEBTcfpK1RjSZFOq6y6nFXaK.jpg",
//                    path: "https://mp4.vjshi.com/2018-12-28/1083f3db90334f86e3fc3586b4472914.mp4"
//        }
//        ]
//    },
//
//    append: {
//        date: 65,
//                content: "用了一段时间，质量很好，体验很流畅，推荐购买",
//                img: [
//        "https://ae01.alicdn.com/kf/HTB1dKZtTgHqK1RjSZFEq6AGMXXaS.jpg",
//                "https://ae01.alicdn.com/kf/HTB18h3oTmzqK1RjSZFjq6zlCFXap.jpg"
//          ],
//        video: [{
//            img: "https://ae01.alicdn.com/kf/HTB1AMEBTcfpK1RjSZFOq6y6nFXaK.jpg",
//                    path: "https://mp4.vjshi.com/2017-06-17/ed1d63669bea39f5ef078c4e194291d6.mp4"
//        }
//        ]
//    }
//},
}
