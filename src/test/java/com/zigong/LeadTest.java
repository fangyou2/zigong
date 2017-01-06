package com.zigong;

import com.zigong.dao.LeadDao;
import com.zigong.model.lead.CountProject;
import com.zigong.model.lead.News;
import com.zigong.model.project.Project;
import com.zigong.service.LeadService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

//    查询所有
    @Test
    public void findProject() {
        List<Project> projects = leadService.findProject();
        System.out.println(projects.size());
        Assert.assertNotNull(projects);
    }

    //添加一条记录
    @Test
    public void addProject() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(c.getTime());

        Project project = new Project();
//        project.setProjectXmfl("重点项目库");
          project.setProjectXmfl("全市项目库");
        project.setProjectAddress("大安区");
        project.setProjectSjjgsj(new Date());
        project.setProjectSzqx("大安区");
        project.setProjectYjztz(12.9);
        project.setProjectBssj(time);
        leadService.save(project);

    }
    //修改
    @Test
    public void updateProject1() {
            Project p=leadService.findById(5);
            p.setProjectAddress("大安区");
            leadService.save(p);
    }
    //删除
    @Test
    public void delProject1() {
          leadService.delete(4);
    }


//    统计查询
    @Test
    public void countProject2() {
        Set<Project> projects=leadService.countTypeNum();
        System.out.println(projects.size());
    }

    @Test
    public void date(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM");
        String time = format.format(c.getTime());
        System.out.println(time);
    }

   @Test
    public void findProjectCount(){
        Set<CountProject> countProjects=leadService.findProjectCount("重点项目库,灾后重建项目库,项目储备库,全市项目库");
       System.out.println(countProjects.size());
    }


    //添加一条记录
    @Test
    public void addNews() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(c.getTime());

        News news=new News();
//        String newsColumns="市发改委动态";
       // String newsColumns="市级部门项目动态";
          //String newsColumns="区市县动态";
          //String newsColumns="其它市动态";
      //    String newsColumns="经济形势";
        String newsColumns="经济研究";
   // String newsColumns="问题通报";
//      String newsColumns="图片信息";
            news.setNewsColumn(newsColumns);
            news.setNewsTit("新闻标题"+"---"+newsColumns);
            news.setNewsDesc("新闻描述"+"---"+newsColumns);
            news.setNewsPublisher("新闻发布方"+newsColumns);
            news.setNewsPublishTime(time);

        leadService.addNews(news);

    }

    //修改时间为2017-1的记录
    @Test
    public void updateNews() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        SimpleDateFormat format2 =  new SimpleDateFormat("yyyy-MM");
        String time2 = format2.format(c.getTime());
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(c.getTime());

        News news=leadService.findByNewsId(time2);
        news.setNewsPublishTime(time);
        leadService.addNews(news);

    }

    //删除一条记录
    @Test
    public void deleteNews() {
        leadService.deleteNews(2);
    }

//    查询所有记录
    @Test
    public void findNews(){
        List<News> newsList=leadService.findNews();
        for (News each:newsList) {
            System.out.println(each.getNewsId()+":"+each.getNewsColumn());
        }
    }

}
