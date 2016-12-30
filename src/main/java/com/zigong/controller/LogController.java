package com.zigong.controller;

import com.zigong.model.Log;
import com.zigong.model.Mail;
import com.zigong.model.User;
import com.zigong.service.LogService;
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
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public Log getMail(@PathVariable("id") int id) {
        Log log = logService.getLog(id);
        return log;
    }

    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public boolean deleteLog(@PathVariable("id") int id) {
        return logService.deleteLog(id);
    }

    @RequestMapping(value = "/edit")
    @ResponseBody
    public boolean editLog(Log log) {
        return logService.addLog(log);
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public boolean addLog(Log log) {
        return logService.addLog(log);
    }
}
