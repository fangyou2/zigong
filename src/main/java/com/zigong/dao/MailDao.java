package com.zigong.dao;

import com.zigong.model.Mail;
import com.zigong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public interface MailDao extends JpaRepository<Mail, Integer> {
    public Mail getMailByMailId(int id);
}
