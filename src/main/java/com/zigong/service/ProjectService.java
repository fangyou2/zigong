package com.zigong.service;

import com.zigong.dao.ProjectDao;
import com.zigong.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 罗健 on 2016/12/29.
 */
@Component
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    /**
     * 添加项目
     */
    public void addProject(Project project) {
        projectDao.save(project);
    }

    /**
     * 查询单一项目
     */
    public Project findProject(Integer projectNumber) {
        return  projectDao.findByProjectNumber(projectNumber);

    }

    /**
     * 查询所有项目
     */
    public List<Project> findAllProject() {
        return projectDao.findAll();
    }

    /**
     * 修改项目
     */
    public void updateProject(Project project) {
        projectDao.save(project);
    }

    /**
     * 删除项目
     */
    public void deleteProject(Integer projectNumber) {
        projectDao.delete(projectNumber);
    }
}
