package com.zigong.controller;

import com.zigong.model.Mail;
import com.zigong.model.User;
import com.zigong.service.FileService;
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
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/add")
    @ResponseBody
    public boolean addFile(Mail mail, HttpSession session) {
        return true;
    }
}
