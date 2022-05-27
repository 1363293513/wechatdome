//package com.example.wechatdemo.wechat.component;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.wechatdemo.wechat.entity.Druggood;
//import com.example.wechatdemo.wechat.eum.RedisKeyEnum;
//import com.example.wechatdemo.wechat.service.work.WorkService;
//import com.example.wechatdemo.wechat.utils.RedisUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.Objects;
//
///**
// * @author : liudy
// * @version : 1.0
// * @createTime : 2022/4/24 10:46
// * @Description : xxx
// */
//@Slf4j
//@Service
//public class RedisCacheComponent {
//    @Resource
//    private RedisUtil redisUtil;
//    @Autowired
//    private WorkService workService;
//
//    /**
//     * 先从缓存取，缓存没有从数据库
//     */
//    public Druggood queryDruggoodFromCache(Integer gid){
////        String key = String.format(RedisKeyEnum.USER_INFO_CACHE_BY_UID.getKey(), uid);
//        String key = String.format(RedisKeyEnum.DRUGGOOD_INFO_CACHE_BY_GID.getKey(), gid);
//        Object value = redisUtil.get(key);
//        log.info("druggood缓存为{}", value);
//        if (Objects.nonNull(value)){
//            return JSONObject.parseObject(value.toString(), Druggood.class);
//        }
//        Druggood druggood = workService.seleOneByDruggoodId(gid);
//        if (Objects.isNull(druggood)){
//            return null;
//        }
//        redisUtil.set(key, JSONObject.toJSONString(druggood), RedisKeyEnum.DRUGGOOD_INFO_CACHE_BY_GID.getExpireTime());
//        return druggood;
//    }
//
//}
