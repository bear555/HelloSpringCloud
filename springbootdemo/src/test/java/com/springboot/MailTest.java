package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Test
    public void sendMail()  {
        try {
            //简单邮件
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom("13060561567@163.com");
            simpleMailMessage.setTo("1612712555@qq.comq");
            simpleMailMessage.setSubject("Happy New Year");
            simpleMailMessage.setText("测试！");
            mailSender.send(simpleMailMessage);

        }catch (Exception e) {
            System.out.println("exception");
        }


        //复杂邮件
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
//        messageHelper.setFrom("admin@163.com");
//        messageHelper.setTo("socks@qq.com");
//        messageHelper.setSubject("Happy New Year");
//        messageHelper.setText("新年快乐！");
//        messageHelper.addInline("doge.gif", new File("xx/xx/doge.gif"));
//        messageHelper.addAttachment("work.docx", new File("xx/xx/work.docx"));
//        mailSender.send(mimeMessage);
    }
}
