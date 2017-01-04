package com.zigong.service;

import com.zigong.dao.LeadDao;
import com.zigong.model.lead.CountProject;
import com.zigong.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashSet;
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
    public List<Project> findProject() {List<Project> projects=leadDao.findAll();return projects;}
//    根据id查询
public Project findById(Integer id) {Project projects=leadDao.findByProjectNumber(id);return projects;}
//    添加数据
    public void save(Project project) {
        leadDao.save(project);
    }
//    更新数据
    public void update(Project project) {leadDao.save(project);}
//    删数据
    public void delete(Integer id) {
        leadDao.delete(id);
    }
//    查询出字段ProjectXmfl为重点项目库的所有记录
    public Set<Project> countTypeNum(){Set<Project> projects=leadDao.findByProjectXmfl("重点项目库");return projects;}

//    统计分类查询出项目投资额等信息
    public Set<CountProject> findProjectCount(String typeName) {
        Set<CountProject> countProjects=new HashSet<>();
        double totalInv=0; //  总投资
        String [] s=typeName.split(",");
        for (int i=0;i<s.length;i++){
            Set<Project> projects=leadDao.findByProjectXmfl(s[i]);
            int oneBillion=0; //  10亿以上投资数
            int fiveMillion=0; //  5-10亿投资数
            int projectCompletion=0;//已经完工的项目个数
//             循环出投资金额这些
            for (Project each:projects) {
                totalInv+=each.getProjectYjztz(); //总投资金额相加
                if (each.getProjectYjztz()>10){
                    oneBillion=++oneBillion;  //10亿以上投资数(单位亿)
                }else if (each.getProjectYjztz()>=5 && each.getProjectYjztz()<=10){
                    fiveMillion=++fiveMillion; // 5-10亿投资数
                }
                if ((new Date().after(each.getProjectSjjgsj()))==true){
                    projectCompletion=++projectCompletion; //已经完工的项目个数(如果现在的时间在实际完工时间之后就返回true)
                }
            }
            countProjects.add(new CountProject(s[i],projects.size(),totalInv,oneBillion,fiveMillion,projectCompletion));
        }
        return countProjects;
    }
}
