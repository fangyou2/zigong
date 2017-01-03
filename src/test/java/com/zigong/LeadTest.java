package com.zigong;

import com.zigong.dao.LeadDao;
import com.zigong.model.project.Project;
import com.zigong.service.LeadService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/30.
 * 钟辉--领导查询项目模块（lead_index.html页面数据读取测试类）
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LeadTest {
    @Autowired
    private LeadService leadService;

    @Test
    public void findProject() {
        List<Project> projects = leadService.findProject();
        System.out.println(projects.size());
        Assert.assertNotNull(projects);
    }

    @Test
    public void addProject() {
        Project project = new Project();
        project.setProjectNumber(3);
        project.setProjectAddress("富顺县");
        leadService.save(project);

    }
    @Test
    public void addProject1() {
        //int total = leadService.total();
       // System.out.println(total);
    }

    @Test
    public void addProject2() {
        Set<Project> projects=leadService.countTypeNum();
        System.out.println(projects.size());
    }
}
