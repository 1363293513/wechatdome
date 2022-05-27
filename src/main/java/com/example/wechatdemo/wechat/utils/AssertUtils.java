package com.example.wechatdemo.wechat.utils;


import com.example.wechatdemo.wechat.exception.BusinessErrorException;

public class AssertUtils {
//    public static void isTrue(boolean condition, String errorCode) {
//        if (condition) {
//            throw BusinessErrorException.error(errorCode);
//        }
//    }
//
//    public static void notNull(Object obj, String errorCode) {
//        if (obj == null) {
//            throw BusinessErrorException.error(errorCode);
//        }
//    }
    public static void notNull(Object obj, String errorCode,String message) {
        if (obj == null) {
            throw BusinessErrorException.error(errorCode,message);
        }
    }
    public static void isTrue(boolean condition, String errorCode,String message) {
        if (condition) {
            throw BusinessErrorException.error(errorCode,message);
        }
    }

}
