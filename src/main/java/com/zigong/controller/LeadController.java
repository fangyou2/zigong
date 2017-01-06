package com.zigong.controller;

import com.zigong.model.lead.CountProject;
import com.zigong.model.lead.News;
import com.zigong.model.project.Project;
import com.zigong.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/30.
 * 钟辉--领导查看项目模块（lead_index.html页面数据读取类）
 */
@RestController
@RequestMapping("/lead")
public class LeadController {
    @Autowired
    private LeadService leadService;
//    测试
    @RequestMapping(value = "/findProject")
    @ResponseBody  //返回json格式的数据
    public List<Project> findProject(){
        List<Project> projects=leadService.findProject();
        return projects;
    }

    @RequestMapping(value = "/findProjectType")
    public Set<Project> findProjectType(){
        Set<Project> projects=leadService.countTypeNum();
        System.out.println(projects.size());
        return projects;
    }

//    正式 (返回一个集合)
@RequestMapping(value = "/findProjectCount")
//@ResponseBody  //返回json格式的数据
public Set<CountProject> findProjectCount(){
//    1.本来这里是从客户端传输的项目分类名在到数据库查找的，就在这里模拟几条，
// 2.也可以在数据库里面根据相同的分类项目名去数据库去重统计，这里我们选择第一种方案
    Set<CountProject> countProjects=leadService.findProjectCount("重点项目库,灾后重建项目库,项目储备库,全市项目库");
    return countProjects;
}

    @RequestMapping(value = "/findProjectReport")
    public Set<CountProject> findProjectReport(){
        Set<CountProject> countProjects=leadService.findProjectReport("自贡市,自流井区,沿滩区,大安区,富顺县");
        return countProjects;
    }

//    查询动态新闻
    @RequestMapping(value = "/findNews")
    public List<News> findNews(){
        List<News> newsSet=leadService.findNews();
        return newsSet;
    }

}
