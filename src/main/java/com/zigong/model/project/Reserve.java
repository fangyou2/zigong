package com.zigong.model.project;

import javax.persistence.*;

/**储备项目信息
 * Created by 罗健 on 2016/12/28.
 */
@Entity
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reserve_number;//项目编号

    private String reserve_pc;//储备批次
    private Boolean reserve_isdszqzc;//是否对上争取支持的在建项目
    private String reserve_state;//储备状态
    private String reserve_rksj;//入库时间
    private String reserve_cbjd;//储备阶段
    private String reserve_tzfs;//投资方式
    private String reserve_xmyt;//项目用途
    private String reserve_xdzj;//下达资金
    private String reserve_hyghmc;//行业规划名称
    private String reserve_sshy;//所属行业
    private String reserve_njsdd;//拟建设地点
    private String reserve_ksztz;//匡算总投资
    private String reserve_jsbyx;//建设必要性
    private String reserve_njsnr;//拟建设内容
    private String reserve_mqgzjd;//目前工作进度
    private String reserve_gczxjg;//工程咨询机构
    private String reserve_yjdddegzjd;//本年底前达到的工作进度
    private String reserve_mqgzjdms;//目前工作进度描述
    private String reserve_cbbm;//储备部门（报送单位）
    private String reserve_bssj;//报送时间

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_number")
    private Project project;//项目


    public Reserve() {
    }

    public Integer getReserve_number() {
        return reserve_number;
    }

    public void setReserve_number(Integer reserve_number) {
        this.reserve_number = reserve_number;
    }

    public String getReserve_pc() {
        return reserve_pc;
    }

    public void setReserve_pc(String reserve_pc) {
        this.reserve_pc = reserve_pc;
    }

    public Boolean getReserve_isdszqzc() {
        return reserve_isdszqzc;
    }

    public void setReserve_isdszqzc(Boolean reserve_isdszqzc) {
        this.reserve_isdszqzc = reserve_isdszqzc;
    }

    public String getReserve_state() {
        return reserve_state;
    }

    public void setReserve_state(String reserve_state) {
        this.reserve_state = reserve_state;
    }

    public String getReserve_rksj() {
        return reserve_rksj;
    }

    public void setReserve_rksj(String reserve_rksj) {
        this.reserve_rksj = reserve_rksj;
    }

    public String getReserve_cbjd() {
        return reserve_cbjd;
    }

    public void setReserve_cbjd(String reserve_cbjd) {
        this.reserve_cbjd = reserve_cbjd;
    }

    public String getReserve_tzfs() {
        return reserve_tzfs;
    }

    public void setReserve_tzfs(String reserve_tzfs) {
        this.reserve_tzfs = reserve_tzfs;
    }

    public String getReserve_xmyt() {
        return reserve_xmyt;
    }

    public void setReserve_xmyt(String reserve_xmyt) {
        this.reserve_xmyt = reserve_xmyt;
    }

    public String getReserve_xdzj() {
        return reserve_xdzj;
    }

    public void setReserve_xdzj(String reserve_xdzj) {
        this.reserve_xdzj = reserve_xdzj;
    }

    public String getReserve_hyghmc() {
        return reserve_hyghmc;
    }

    public void setReserve_hyghmc(String reserve_hyghmc) {
        this.reserve_hyghmc = reserve_hyghmc;
    }

    public String getReserve_sshy() {
        return reserve_sshy;
    }

    public void setReserve_sshy(String reserve_sshy) {
        this.reserve_sshy = reserve_sshy;
    }

    public String getReserve_njsdd() {
        return reserve_njsdd;
    }

    public void setReserve_njsdd(String reserve_njsdd) {
        this.reserve_njsdd = reserve_njsdd;
    }

    public String getReserve_ksztz() {
        return reserve_ksztz;
    }

    public void setReserve_ksztz(String reserve_ksztz) {
        this.reserve_ksztz = reserve_ksztz;
    }

    public String getReserve_jsbyx() {
        return reserve_jsbyx;
    }

    public void setReserve_jsbyx(String reserve_jsbyx) {
        this.reserve_jsbyx = reserve_jsbyx;
    }

    public String getReserve_njsnr() {
        return reserve_njsnr;
    }

    public void setReserve_njsnr(String reserve_njsnr) {
        this.reserve_njsnr = reserve_njsnr;
    }

    public String getReserve_mqgzjd() {
        return reserve_mqgzjd;
    }

    public void setReserve_mqgzjd(String reserve_mqgzjd) {
        this.reserve_mqgzjd = reserve_mqgzjd;
    }

    public String getReserve_gczxjg() {
        return reserve_gczxjg;
    }

    public void setReserve_gczxjg(String reserve_gczxjg) {
        this.reserve_gczxjg = reserve_gczxjg;
    }

    public String getReserve_yjdddegzjd() {
        return reserve_yjdddegzjd;
    }

    public void setReserve_yjdddegzjd(String reserve_yjdddegzjd) {
        this.reserve_yjdddegzjd = reserve_yjdddegzjd;
    }

    public String getReserve_mqgzjdms() {
        return reserve_mqgzjdms;
    }

    public void setReserve_mqgzjdms(String reserve_mqgzjdms) {
        this.reserve_mqgzjdms = reserve_mqgzjdms;
    }

    public String getReserve_cbbm() {
        return reserve_cbbm;
    }

    public void setReserve_cbbm(String reserve_cbbm) {
        this.reserve_cbbm = reserve_cbbm;
    }

    public String getReserve_bssj() {
        return reserve_bssj;
    }

    public void setReserve_bssj(String reserve_bssj) {
        this.reserve_bssj = reserve_bssj;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}