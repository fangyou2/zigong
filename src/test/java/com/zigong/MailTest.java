package com.zigong;

import com.zigong.model.Mail;
import com.zigong.model.User;
import com.zigong.service.MailService;
import com.zigong.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
    @Autowired
    private MailService mailService;

    @Test
    public void add() {
        Mail mail = new Mail();
        mail.setMailTitle("ewqew");

        User user = new User();
        user.setUserId(1);

        boolean b = mailService.addMail(mail, user);
        Assert.assertTrue(b);
    }

}
