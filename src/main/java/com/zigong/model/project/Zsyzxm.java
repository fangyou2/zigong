package com.zigong.model.project;

import javax.persistence.*;

/**招商引资项目管理
 * Created by 罗健 on 2016/12/28.
 */
@Entity
public class Zsyzxm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer zsyzxm_number;//项目编号

    private String yzxm_zszt;//招商状态
    private String yzxm_hzlx;//合作类型
    private String yzxm_tzgc;//投资构成
    private String yzxm_jstj;//建设条件
    private String yzxm_xmjz;//项目进展
    private String yzxm_zdmj;//占地面积
    private String yzxm_yyjtz;//已引进投资
    private Boolean yzxm_isyhdk;//是否需要银行贷款
    private Boolean yzxm_iszdtj;//是否重点推荐
    private String yzxm_scyc;//市场预测
    private String yzxm_tzhbtj;//投资回报途径
    private String yzxm_scysfx;//市场优势分析
    private Boolean yzxm_isfbdww;//是否发布到外网

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_number")
    private Project project;//项目


    public Zsyzxm() {
    }

    public Integer getZsyzxm_number() {
        return zsyzxm_number;
    }

    public void setZsyzxm_number(Integer zsyzxm_number) {
        this.zsyzxm_number = zsyzxm_number;
    }

    public String getYzxm_zszt() {
        return yzxm_zszt;
    }

    public void setYzxm_zszt(String yzxm_zszt) {
        this.yzxm_zszt = yzxm_zszt;
    }

    public String getYzxm_hzlx() {
        return yzxm_hzlx;
    }

    public void setYzxm_hzlx(String yzxm_hzlx) {
        this.yzxm_hzlx = yzxm_hzlx;
    }

    public String getYzxm_tzgc() {
        return yzxm_tzgc;
    }

    public void setYzxm_tzgc(String yzxm_tzgc) {
        this.yzxm_tzgc = yzxm_tzgc;
    }

    public String getYzxm_jstj() {
        return yzxm_jstj;
    }

    public void setYzxm_jstj(String yzxm_jstj) {
        this.yzxm_jstj = yzxm_jstj;
    }

    public String getYzxm_xmjz() {
        return yzxm_xmjz;
    }

    public void setYzxm_xmjz(String yzxm_xmjz) {
        this.yzxm_xmjz = yzxm_xmjz;
    }

    public String getYzxm_zdmj() {
        return yzxm_zdmj;
    }

    public void setYzxm_zdmj(String yzxm_zdmj) {
        this.yzxm_zdmj = yzxm_zdmj;
    }

    public String getYzxm_yyjtz() {
        return yzxm_yyjtz;
    }

    public void setYzxm_yyjtz(String yzxm_yyjtz) {
        this.yzxm_yyjtz = yzxm_yyjtz;
    }

    public Boolean getYzxm_isyhdk() {
        return yzxm_isyhdk;
    }

    public void setYzxm_isyhdk(Boolean yzxm_isyhdk) {
        this.yzxm_isyhdk = yzxm_isyhdk;
    }

    public Boolean getYzxm_iszdtj() {
        return yzxm_iszdtj;
    }

    public void setYzxm_iszdtj(Boolean yzxm_iszdtj) {
        this.yzxm_iszdtj = yzxm_iszdtj;
    }

    public String getYzxm_scyc() {
        return yzxm_scyc;
    }

    public void setYzxm_scyc(String yzxm_scyc) {
        this.yzxm_scyc = yzxm_scyc;
    }

    public String getYzxm_tzhbtj() {
        return yzxm_tzhbtj;
    }

    public void setYzxm_tzhbtj(String yzxm_tzhbtj) {
        this.yzxm_tzhbtj = yzxm_tzhbtj;
    }

    public String getYzxm_scysfx() {
        return yzxm_scysfx;
    }

    public void setYzxm_scysfx(String yzxm_scysfx) {
        this.yzxm_scysfx = yzxm_scysfx;
    }

    public Boolean getYzxm_isfbdww() {
        return yzxm_isfbdww;
    }

    public void setYzxm_isfbdww(Boolean yzxm_isfbdww) {
        this.yzxm_isfbdww = yzxm_isfbdww;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}