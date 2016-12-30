package com.zigong.controller;

import com.zigong.model.Log;
import com.zigong.service.BoxService;
import com.zigong.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/27.
 */
@RestController
@RequestMapping("/box")
public class BoxController {
    @Autowired
    private BoxService boxService;


}
