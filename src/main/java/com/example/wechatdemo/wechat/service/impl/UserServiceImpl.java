//package com.example.wechatdemo.wechat.service.impl;
//
//import com.example.wechatdemo.wechat.entity.User;
//import com.example.wechatdemo.wechat.entity.UserExample;
//import com.example.wechatdemo.wechat.mapper.UserMapper;
//import com.example.wechatdemo.wechat.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserMapper userMapper;
//
//
//    @Override
//    public boolean login(User user) {
//        UserExample userExample = new UserExample();
//        userExample.createCriteria().andUnameEqualTo(user.getUname()).andUpasswordEqualTo(user.getUpassword());
//        List<User> users = userMapper.selectByExample(userExample);
//        if (users != null){
//            return true;
//        }else {
//            return false;
//        }
//    }
//}
