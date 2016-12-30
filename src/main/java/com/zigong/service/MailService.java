package com.zigong.service;

import com.zigong.dao.MailDao;
import com.zigong.dao.UserDao;
import com.zigong.model.Mail;
import com.zigong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class MailService {
    @Autowired
    private MailDao mailDao;
    @Autowired
    private UserDao userDao;

    public boolean addMail(Mail mail, User user) {
        boolean result = false;

        if (mail != null && user != null) {
            mail.setMailTime(new Date());
            mail.setMailRead(false);

            if(user!=null){
                mail.setUser(user);
                Set<Mail> mailSet = user.getMail();

                mailSet.add(mail);
                user.setMail(mailSet);
                if (mailDao.save(mail) != null) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean deleteMail(int id, User user) {
        boolean result = false;
        Mail mail = mailDao.getMailByMailId(id);
        if (mail != null && mail.getUser().getUserId() == user.getUserId()) {
            mailDao.delete(mail);
            result = true;
        }
        return result;
    }

    /**
     * 比对user id是不是mail 对应的user id
     *
     * @param mail
     * @param user
     * @return
     */
    public boolean editMail(Mail mail, User user) {
        boolean result = false;
        Mail mail1 = mailDao.getMailByMailId(mail.getMailId());
        if (mail != null && mail1 != null && user != null && user.getUserId() == mail1.getUser().getUserId()) {
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

    public Mail getMail(int id) {
        return mailDao.getMailByMailId(id);
    }
}
