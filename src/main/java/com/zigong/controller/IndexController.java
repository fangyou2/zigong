package com.zigong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/4.
 */
@Controller
class IndexController {

    @RequestMapping("/")
    public String index() {
        return "forward:/lead_index.html";
    }
}