package com.nsw.service;

import org.springframework.stereotype.Repository;

/**
 * @author Lizhiyuan
 * @BelongsPackage springbootstw
 * @date 2019-11-26 12:08
 * @Description: todo
 */
public interface MailService {

    /*
    * 发送多媒体类型邮件
    * @param to
    * @param subject
    * @param context
    * */
    void sendMimeMail(String to, String subject, String context);
}
