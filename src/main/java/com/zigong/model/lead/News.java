package com.zigong.model.lead;

import com.zigong.model.project.Project;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/1/6.
 *  钟辉--动态新闻
 */
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newsId; //新闻编号
    private String newsColumn; //新闻栏目
    private String newsTit; //新闻标题
    private String newsDesc; //新闻描述
    private String newsPublisher; //发布方
    private String newsPublishTime; //发布时间
//    private int projectId;  //关联项目

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "projectNumber")
    private Project project;

    public News() {
    }

    public News(int newsId, String newsColumn, String newsTit, String newsDesc, String newsPublisher, String newsPublishTime) {
        this.newsId = newsId;
        this.newsColumn = newsColumn;
        this.newsTit = newsTit;
        this.newsDesc = newsDesc;
        this.newsPublisher = newsPublisher;
        this.newsPublishTime = newsPublishTime;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsColumn() {
        return newsColumn;
    }

    public void setNewsColumn(String newsColumn) {
        this.newsColumn = newsColumn;
    }

    public String getNewsTit() {
        return newsTit;
    }

    public void setNewsTit(String newsTit) {
        this.newsTit = newsTit;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsPublisher() {
        return newsPublisher;
    }

    public void setNewsPublisher(String newsPublisher) {
        this.newsPublisher = newsPublisher;
    }

    public String getNewsPublishTime() {
        return newsPublishTime;
    }

    public void setNewsPublishTime(String newsPublishTime) {
        this.newsPublishTime = newsPublishTime;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
