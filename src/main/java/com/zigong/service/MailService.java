package com.zigong.service;

import com.zigong.dao.MailDao;
import com.zigong.dao.UserDao;
import com.zigong.model.Mail;
import com.zigong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class MailService {
    @Autowired
    private MailDao mailDao;

    public boolean addMail(Mail mail, User user) {
        boolean result = false;
        if (mail != null && user != null) {
            mail.setMailTime(new Date());
            mail.setUser(user);
            mail.setMailRead(false);
            Mail save = mailDao.save(mail);
            if (save != null) {
                result = true;
            }
        }
        return result;
    }

    public boolean deleteMail(Mail mail, User user) {
        boolean result = false;
        if (mail != null) {
            Mail mail1 = mailDao.getMailByMailId(mail.getMailId());
            if (mail1 != null && mail1.getUser().getUserId() == user.getUserId()) {
                mailDao.delete(mail1);
                result = true;
            }
        }
        return result;
    }

    public boolean editMail(Mail mail, User user) {
        boolean result = false;
        if (mail != null && user != null && user.getUserId() == mail.getUser().getUserId()) {
            mail.setMailTime(new Date());
            mail.setUser(user);
            mail.setMailRead(false);
            Mail save = mailDao.save(mail);
            if (save != null) {
                result = true;
            }
        }
        return result;
    }
}
