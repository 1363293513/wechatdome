package com.example.wechatdemo.wechat.service.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class ScheduledService {
    @Autowired
    JavaMailSenderImpl mailSender;


    //秒   分   时     日   月   周几
    //0 * * * * MON-FRI
    //注意cron表达式的用法；   表示每2秒 执行任务
    @Scheduled(cron = "0/2 * * * * ?")
    public void hello() throws MessagingException {
        System.out.println("hello666.....");

        //任务发送邮件
        //sentMail();

    }

    private void sentMail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("哈喽小傻逼谭丽婷，我爱你，任务两秒一次");
        helper.setText("<b style='color:red'>哈喽哈喽陈清揉，在干嘛在干嘛~~~~~</b>",true);
        //发送附件
//        helper.addAttachment("1.jpg",new File(""));
//        helper.addAttachment("2.jpg",new File(""));
        //helper.setTo("727950068@qq.com");
        helper.setTo("457425649@qq.com");
        helper.setFrom("1363293513@qq.com");
//        helper.setTo("2249798261@qq.com");
//        helper.setFrom("2249798261@qq.com");
        mailSender.send(mimeMessage);
    }
}
