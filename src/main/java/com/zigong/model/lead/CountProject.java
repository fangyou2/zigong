package com.zigong.model.lead;

/**
 * Created by Administrator on 2017/1/4.
 *    钟辉--专门用来封装领导界面的一些统计数据
 */
public class CountProject {
    private String projectTypeName; //项目类型名
    private int projectTypeNum; //项目每个类型数量
    private double totalInv; //  总投资
    private int oneBillion; //  10亿以上投资数
    private int fiveMillion; //  5-10亿投资数
    private int projectCompletion;//已经完工的项目个数

    public CountProject() {
    }


    public CountProject(String projectTypeName, int projectTypeNum, double totalInv, int oneBillion, int fiveMillion, int projectCompletion) {
        this.projectTypeName = projectTypeName;
        this.projectTypeNum = projectTypeNum;
        this.totalInv = totalInv;
        this.oneBillion = oneBillion;
        this.fiveMillion = fiveMillion;
        this.projectCompletion = projectCompletion;
    }

    public String getProjectTypeName() {
        return projectTypeName;
    }

    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
    }

    public int getProjectTypeNum() {
        return projectTypeNum;
    }

    public void setProjectTypeNum(int projectTypeNum) {
        this.projectTypeNum = projectTypeNum;
    }

    public double getTotalInv() {
        return totalInv;
    }

    public void setTotalInv(double totalInv) {
        this.totalInv = totalInv;
    }

    public int getOneBillion() {
        return oneBillion;
    }

    public void setOneBillion(int oneBillion) {
        this.oneBillion = oneBillion;
    }

    public int getFiveMillion() {
        return fiveMillion;
    }

    public void setFiveMillion(int fiveMillion) {
        this.fiveMillion = fiveMillion;
    }

    public int getProjectCompletion() {
        return projectCompletion;
    }

    public void setProjectCompletion(int projectCompletion) {
        this.projectCompletion = projectCompletion;
    }
}
