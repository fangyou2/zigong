package com.zigong.service;

import com.zigong.dao.FileDao;
import com.zigong.dao.MailDao;
import com.zigong.dao.UserDao;
import com.zigong.model.Mail;
import com.zigong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class FileService {
    @Autowired
    private FileDao fileDao;


}
