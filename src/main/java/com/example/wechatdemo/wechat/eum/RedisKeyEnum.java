package com.example.wechatdemo.wechat.eum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : liudy
 * @version : 1.0
 * @createTime : 2022/4/24 10:49
 * @Description : xxx
 */
@Getter
@AllArgsConstructor
public enum RedisKeyEnum {

//    USER_INFO_CACHE_BY_UID("activity:service:user:info:uid:%s", 900L),
    // 大分类缓存
    BIG_CLASS_FROM_CACHE("work:service:bigclass:info", 900L),
    DRUGGOOD_INFO_CACHE_BY_GID("work:service:druggood:info:gid:%s", 900L)
    ;



    private String key;
    private Long expireTime;
}
