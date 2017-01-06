package com.zigong.service;

import com.zigong.dao.LeadDao;
import com.zigong.dao.LeadNewsDao;
import com.zigong.model.lead.CountProject;
import com.zigong.model.lead.News;
import com.zigong.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2016/12/30.
 */
@Component
public class LeadService {
    @Autowired
    private LeadDao leadDao;
    @Autowired
    private LeadNewsDao leadNewsDao;
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

    //    项目报送情况
    public Set<CountProject> findProjectReport(String address) {
        Set<CountProject> countProjects=new HashSet<>();
        //获取上一月项目报送情况
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM");
        String t = format.format(c.getTime());
        String time = format.format(c.getTime())+"%"; //模糊查询，字符串拼装
        String[] a=address.split(",");
        int allc=0; //累加所有的数量
        for (int j=0;j<a.length;j++){
            Set<Project> p=leadDao.findByProjectSzqxAndProjectBssjLike(a[j],time);
            allc+=p.size();
            countProjects.add(new CountProject(t,a[j],p.size()));
        }
        countProjects.add(new CountProject(t,"系统共报送：",allc));
        return countProjects;
    }


//    新闻模块
    //    添加动态新闻
    public void addNews(News news) {
        leadNewsDao.save(news);
    }
    //    修改动态新闻
    public void updateNews(News news) {
        leadNewsDao.save(news);
    }

    //     工具发布日期查询
    public News findByNewsId(String data) {News news=leadNewsDao.findByNewsPublishTime(data);return news;}

    //    删除动态新闻
    public void deleteNews(Integer id) {
        leadNewsDao.delete(id);
    }

//    查询出动态新闻
    public List<News> findNews() {
        List<News> newsSet=leadNewsDao.findAll();
        return newsSet;
    }
}
