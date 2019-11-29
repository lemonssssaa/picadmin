package com.nsw.service;


import com.nsw.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

/**
 * @author Lizhiyuan
 * @BelongsPackage springbootstw
 * @date 2019-11-26 12:08
 * @Description: todo
 * @description: 邮件处理类
 * @author: luohanye
 * @create: 2019-04-19
 **/
@Service
public class MailServiceImpl implements MailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendMimeMail(String to, String subject, String context) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message,true);
            helper.setFrom(from);
            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(context, true);
            javaMailSender.send(message);
            //日志信息
            logger.info("邮件已经发送。");
        } catch (MessagingException e){
            logger.error("发送邮件时发生异常！",e);
        }
    }
}
