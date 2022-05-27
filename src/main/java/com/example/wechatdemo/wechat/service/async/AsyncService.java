package com.example.wechatdemo.wechat.service.async;

import com.example.wechatdemo.wechat.utils.SentMail;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class AsyncService {

    @Async
    public void asynDdmo() throws MessagingException {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException  e){
            e.printStackTrace();
        }

        System.out.println("(这个地方后面可以用来发送邮件)业务进行中....");
        SentMail sentMail = new SentMail();
       // sentMail.sentMailA();
    }
}
