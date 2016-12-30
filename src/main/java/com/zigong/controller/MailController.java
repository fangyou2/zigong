package com.zigong.controller;

import com.zigong.dao.MailDao;
import com.zigong.dao.TestDao;
import com.zigong.model.Mail;
import com.zigong.model.TestModel;
import com.zigong.model.User;
import com.zigong.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/12/27.
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public Mail getMail(@PathVariable("id") int id) {
        Mail mail = mailService.getMail(id);
        return mail;
    }

    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public boolean deleteMail(@PathVariable("id") int id, HttpSession session) {
        User user = (User) session.getAttribute("user");
        return mailService.deleteMail(id, user);
    }

    @RequestMapping(value = "/edit")
    @ResponseBody
    public boolean editMail(Mail mail, HttpSession session) {
        User user = (User) session.getAttribute("user");
        return mailService.editMail(mail, user);
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public boolean addMail(Mail mail, HttpSession session) {
        User user = (User) session.getAttribute("user");
        return mailService.addMail(mail, user);
    }
}
