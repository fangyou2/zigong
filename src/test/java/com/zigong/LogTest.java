package com.zigong;

import com.zigong.model.Log;
import com.zigong.model.Mail;
import com.zigong.model.User;
import com.zigong.service.LogService;
import com.zigong.service.MailService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {
    @Autowired
    private LogService logService;

//    @Test
//    public void add() {
//        Log log = new Log();
//        log.setLogTitle("3211");
//        log.setLogContent("dafsa");
//        User user = new User();
//        user.setUserId(1);
//        log.setUser(user);
//        boolean b = logService.addLog(log);
//        Assert.assertTrue(b);
//    }

    @Test
    public void getOne() {
        Log log = logService.getLog(1);
        Assert.assertTrue(true);
    }
    @Test
    public void getByUser() {
        User user = new User();
        user.setUserId(1);
        Set<Log> logs = logService.getLogs(user);
        Assert.assertTrue(true);
    }
    @Test
    public void delete() {
        boolean b = logService.deleteLog(1);
        Assert.assertTrue(b);
    }

}
