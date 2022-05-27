package com.example.wechatdemo.wechat.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class SentMail {
    @Autowired
    JavaMailSenderImpl mailSender;

    public  void sentMailA() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("定时任务代码测试");
        helper.setText("<b style='color:red'>小笼包，在干嘛在干嘛~~~~~</b>",true);
        //发送附件
//        helper.addAttachment("1.jpg",new File(""));
//        helper.addAttachment("2.jpg",new File(""));
        helper.setTo("727950068@qq.com");
        helper.setFrom("1363293513@qq.com");
        mailSender.send(mimeMessage);
    }


}
