package com.zigong.service;

import com.zigong.dao.LeadDao;
import com.zigong.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/30.
 */
@Component
public class LeadService {
    @Autowired
    private LeadDao leadDao;
//    查询project里面所有的内容
    public List<Project> findProject() {
        List<Project> projects=leadDao.findAll();
        return projects;
    }
//    添加数据
    public void save(Project project) {
        leadDao.save(project);
    }
//    查询出字段ProjectXmfl为dsa的所有记录
    public Set<Project> countTypeNum(){
//        Set<Project> dsa = leadDao.findByProjectXmfl("dsa");
//        return dsa.size();
        Set<Project> projects=leadDao.findByProjectXmfl("重点项目库");
        return projects;
    }
}
