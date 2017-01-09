package com.zigong.service;

import com.zigong.dao.UserDao;
import com.zigong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    public User login(User user) {
        User result = null;
        User one = userDao.getUserByUserId(user.getUserId());
        if (one != null && one.getUserPassword().equals(user.getUserPassword())) {
            result = one;
        }
        return result;
    }

    public boolean register(User user) {
        boolean result = false;
        Object save = userDao.save(user);
        if (save != null) {
            result = true;
        }
        return result;
    }

    public boolean xiuGaiMima(User user, User session) {
        boolean result = false;
        if(session!=null&&user.getUserId()==session.getUserId()){
            session.setUserPassword(user.getUserPassword());
            Object save = userDao.save(session);
            if (save != null) {
                result = true;
            }
        }
        return result;
    }

    public boolean xiuGaiOther(User user, User session) {
        boolean result = false;
        if(session!=null&&user.getUserId()==session.getUserId()){
            user.setUserPassword(session.getUserPassword());
            Object save = userDao.save(user);
            if (save != null) {
                result = true;
            }
        }
        return result;
    }

}
