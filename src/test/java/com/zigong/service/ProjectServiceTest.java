package com.zigong.service;

import com.zigong.model.project.Project;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

/**
 * Created by 罗健 on 2017/1/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceTest {
    @Autowired
    private ProjectService projectService;
    @Test
    public void addProjectTest() {
        Project project = new Project();
       
        project.setProjectAddress("富顺县");
        projectService.addProject(project);

    }


    @Test
    public void updateProjectTest() {
        Project project=projectService.findProject(3);
        project.setProjectAddress("富顺县李桥镇");
        projectService.updateProject(project);

    }

    @Test
    public void deleteProjectTest() {

        projectService.deleteProject(3);

    }


    @Test
    public void findAllProjectTest() {

        List<Project> projects = projectService.findAllProject();
        Assert.assertEquals(2,projects.size());
    }

}
