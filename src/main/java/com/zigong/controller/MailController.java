package com.zigong.controller;

import com.zigong.dao.TestDao;
import com.zigong.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/27.
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private TestDao testDao;
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        testDao.save(new TestModel(null,"ok"));
        return "ok";
    }
}
