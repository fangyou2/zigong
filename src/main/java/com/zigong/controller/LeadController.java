package com.zigong.controller;

import com.zigong.model.project.Project;
import com.zigong.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/findProject")
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
}
