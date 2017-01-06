package com.zigong.controller;

import com.zigong.model.project.Project;
import com.zigong.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/1/3.
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    /**
     * 添加项目
     *
     * @param project
     * @return
     */
    @RequestMapping("/addProject")
    public void addProject(HttpServletResponse response,Project project) {
        projectService.addProject(project);
        try {
            response.sendRedirect("../back_interface/back_project.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改项目
     *
     * @param project
     * @return
     */
    @RequestMapping("/updateProject")
    public String updateProject(Project project) {
        projectService.updateProject(project);
        return null;
    }

    /**
     * 添加项目
     * @param projectNumber
     * @return
     */
    @RequestMapping("/deletProject")
    public String deleteProject(Integer projectNumber){
        projectService.deleteProject(projectNumber);
        return null;
    }


    /**
     * 查询所有项目
     * @param
     * @return
     */
    @RequestMapping("/findAllProject")
    public List<Project> findAllProject(){
       List<Project> projects= projectService.findAllProject();
        return projects;
    }

    /**
     * 通过编号查询项目
     * @param
     * @return
     */
    @RequestMapping("/findProject")
    public Project findProject(Integer projectNumber){
        Project project= projectService.findProject(projectNumber);
        return project;
    }

}

