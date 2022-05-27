package com.example.wechatdemo.wechat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppendVo implements Serializable {
    private Integer date;
    private String content;
    private String[] img;
    private List<VideoVo> video;



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
//        }
}
