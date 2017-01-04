package com.zigong.controller;

import com.zigong.dao.TestDao;
import com.zigong.model.TestModel;
import com.zigong.model.User;
import com.zigong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/12/27.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public boolean login(User user,HttpSession session) {
        boolean result = false;
        user = userService.login(user);
        if(user!=null){
            session.setAttribute("user",user);
            result=true;
        }
        return result;
    }

    @RequestMapping(value = "/xiuGaiMima")
    @ResponseBody
    public boolean xiuGaiMima(User user, HttpSession session) {
        User user1 = (User) session.getAttribute("user");
        boolean b = userService.xiuGaiMima(user, user1);
        if(b){
            session.removeAttribute("user");
        }
        return b;
    }
    @RequestMapping(value = "/xiuGaiOther")
    @ResponseBody
    public boolean xiuGaiOther(User user, HttpSession session) {
        User user1 = (User) session.getAttribute("user");
        return userService.xiuGaiOther(user, user1);
    }
    @RequestMapping(value = "/logout")
    @ResponseBody
    public boolean logout(HttpSession session) {
        session.removeAttribute("user");
        return true;
    }
    @RequestMapping(value = "/get")
    @ResponseBody
    public User getName(HttpSession session) {
        User user = (User) session.getAttribute("user");
        user.setGroups(null);
        user.setLog(null);
        user.setMail(null);
        user.setSite(null);
        return user;
    }
}
