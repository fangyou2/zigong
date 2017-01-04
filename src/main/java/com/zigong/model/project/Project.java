package com.zigong.model.project;

import javax.persistence.*;
import java.util.Date;

/**项目
 * Created by 罗健 on 2016/12/28.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer projectNumber; //项目编号

    private String projectName; //项目名称

    private Integer projectOwner;//项目业主
    private Integer projectFddbr;//项目法人代表
    private Integer projectBslxr;//项目报送联系人
    private Integer projectBslxrdh;//项目报送联系人手机

    private String projectFgld;//分管领导
    private String projectBsdw;//报送单位
    private String projectSjhyglbm;//市级行业主管部门
    private String projectZrbm;//责任部门

    private String projectSzqx;//所在区县
    private String projectState;//建设状态
    private double projectYjztz;//预计总投资
    private String projectJsxz;//建设性质
    private String projectJscsnx;//建设初始年
    private String projectJszznx;//建设最终年
    private String projectAddress;//建设地址
    private String projectContent;//建设内容
    private String projectBackground;//建设背景
    private String projectYjjjhshxy;//预计经济和社会效益
    private Date projectJhkgsj;//计划开工时间
    private Date projectSjkgsj;//实际开工时间
    private Date projectJhjgsj;//计划竣工时间
    private Date projectSjjgsj;//实际竣工时间

    private Boolean projectIzsyzxm;//是否招商引资项目
    private Boolean projectIsgzxm;//是否国债项目
    private Boolean projectIsyjxm;//是否引进项目
    private Boolean projectIszftz;//是否政府投资项目
    private String projectXmfl;//项目分类
    private String projectQxxmfl;//区县项目分类
    private Boolean projectIsjnjp;//是否节能减排项目
    private Boolean projectIsxxcy;//是否新兴产业
    private String projectXxcyfl;//新兴产业分类
    private String projectSssjzlgnq;//所属市级战略功能区

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "project")
    private Reserve reserve;//储备项目信息
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "project")
    private Zsyzxm zsyzxm;//招商引资项目管理

    public Project() {
    }

    public Integer getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Integer projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(Integer projectOwner) {
        this.projectOwner = projectOwner;
    }

    public Integer getProjectFddbr() {
        return projectFddbr;
    }

    public void setProjectFddbr(Integer projectFddbr) {
        this.projectFddbr = projectFddbr;
    }

    public Integer getProjectBslxr() {
        return projectBslxr;
    }

    public void setProjectBslxr(Integer projectBslxr) {
        this.projectBslxr = projectBslxr;
    }

    public Integer getProjectBslxrdh() {
        return projectBslxrdh;
    }

    public void setProjectBslxrdh(Integer projectBslxrdh) {
        this.projectBslxrdh = projectBslxrdh;
    }

    public String getProjectFgld() {
        return projectFgld;
    }

    public void setProjectFgld(String projectFgld) {
        this.projectFgld = projectFgld;
    }

    public String getProjectBsdw() {
        return projectBsdw;
    }

    public void setProjectBsdw(String projectBsdw) {
        this.projectBsdw = projectBsdw;
    }

    public String getProjectSjhyglbm() {
        return projectSjhyglbm;
    }

    public void setProjectSjhyglbm(String projectSjhyglbm) {
        this.projectSjhyglbm = projectSjhyglbm;
    }

    public String getProjectZrbm() {
        return projectZrbm;
    }

    public void setProjectZrbm(String projectZrbm) {
        this.projectZrbm = projectZrbm;
    }

    public String getProjectSzqx() {
        return projectSzqx;
    }

    public void setProjectSzqx(String projectSzqx) {
        this.projectSzqx = projectSzqx;
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }

    public double getProjectYjztz() {
        return projectYjztz;
    }

    public void setProjectYjztz(double projectYjztz) {
        this.projectYjztz = projectYjztz;
    }

    public String getProjectJsxz() {
        return projectJsxz;
    }

    public void setProjectJsxz(String projectJsxz) {
        this.projectJsxz = projectJsxz;
    }

    public String getProjectJscsnx() {
        return projectJscsnx;
    }

    public void setProjectJscsnx(String projectJscsnx) {
        this.projectJscsnx = projectJscsnx;
    }

    public String getProjectJszznx() {
        return projectJszznx;
    }

    public void setProjectJszznx(String projectJszznx) {
        this.projectJszznx = projectJszznx;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    public String getProjectBackground() {
        return projectBackground;
    }

    public void setProjectBackground(String projectBackground) {
        this.projectBackground = projectBackground;
    }

    public String getProjectYjjjhshxy() {
        return projectYjjjhshxy;
    }

    public void setProjectYjjjhshxy(String projectYjjjhshxy) {
        this.projectYjjjhshxy = projectYjjjhshxy;
    }

    public Date getProjectJhkgsj() {
        return projectJhkgsj;
    }

    public void setProjectJhkgsj(Date projectJhkgsj) {
        this.projectJhkgsj = projectJhkgsj;
    }

    public Date getProjectSjkgsj() {
        return projectSjkgsj;
    }

    public void setProjectSjkgsj(Date projectSjkgsj) {
        this.projectSjkgsj = projectSjkgsj;
    }

    public Date getProjectJhjgsj() {
        return projectJhjgsj;
    }

    public void setProjectJhjgsj(Date projectJhjgsj) {
        this.projectJhjgsj = projectJhjgsj;
    }

    public Date getProjectSjjgsj() {
        return projectSjjgsj;
    }

    public void setProjectSjjgsj(Date projectSjjgsj) {
        this.projectSjjgsj = projectSjjgsj;
    }

    public Boolean getProjectIzsyzxm() {
        return projectIzsyzxm;
    }

    public void setProjectIzsyzxm(Boolean projectIzsyzxm) {
        this.projectIzsyzxm = projectIzsyzxm;
    }

    public Boolean getProjectIsgzxm() {
        return projectIsgzxm;
    }

    public void setProjectIsgzxm(Boolean projectIsgzxm) {
        this.projectIsgzxm = projectIsgzxm;
    }

    public Boolean getProjectIsyjxm() {
        return projectIsyjxm;
    }

    public void setProjectIsyjxm(Boolean projectIsyjxm) {
        this.projectIsyjxm = projectIsyjxm;
    }

    public Boolean getProjectIszftz() {
        return projectIszftz;
    }

    public void setProjectIszftz(Boolean projectIszftz) {
        this.projectIszftz = projectIszftz;
    }

    public String getProjectXmfl() {
        return projectXmfl;
    }

    public void setProjectXmfl(String projectXmfl) {
        this.projectXmfl = projectXmfl;
    }

    public String getProjectQxxmfl() {
        return projectQxxmfl;
    }

    public void setProjectQxxmfl(String projectQxxmfl) {
        this.projectQxxmfl = projectQxxmfl;
    }

    public Boolean getProjectIsjnjp() {
        return projectIsjnjp;
    }

    public void setProjectIsjnjp(Boolean projectIsjnjp) {
        this.projectIsjnjp = projectIsjnjp;
    }

    public Boolean getProjectIsxxcy() {
        return projectIsxxcy;
    }

    public void setProjectIsxxcy(Boolean projectIsxxcy) {
        this.projectIsxxcy = projectIsxxcy;
    }

    public String getProjectXxcyfl() {
        return projectXxcyfl;
    }

    public void setProjectXxcyfl(String projectXxcyfl) {
        this.projectXxcyfl = projectXxcyfl;
    }

    public String getProjectSssjzlgnq() {
        return projectSssjzlgnq;
    }

    public void setProjectSssjzlgnq(String projectSssjzlgnq) {
        this.projectSssjzlgnq = projectSssjzlgnq;
    }

    public Reserve getReserve() {
        return reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    public Zsyzxm getZsyzxm() {
        return zsyzxm;
    }

    public void setZsyzxm(Zsyzxm zsyzxm) {
        this.zsyzxm = zsyzxm;
    }
}