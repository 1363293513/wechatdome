package com.example.wechatdemo.wechat.controller;

import com.example.wechatdemo.wechat.service.async.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public void asyncDemo() throws MessagingException {
        asyncService.asynDdmo();
    }


}
