package com.zigong.model.project;

import javax.persistence.*;

/**储备项目信息
 * Created by 罗健 on 2016/12/28.
 */
@Entity
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reserveNumber;//项目编号

    private String reservePc;//储备批次
    private Boolean reserveIsdszqzc;//是否对上争取支持的在建项目
    private String reserveState;//储备状态
    private String reserveRksj;//入库时间
    private String reserveCbjd;//储备阶段
    private String reserveTzfs;//投资方式
    private String reserveXmyt;//项目用途
    private String reserveXdzj;//下达资金
    private String reserveHyghmc;//行业规划名称
    private String reserveSshy;//所属行业
    private String reserveNjsdd;//拟建设地点
    private String reserveKsztz;//匡算总投资
    private String reserveJsbyx;//建设必要性
    private String reserveNjsnr;//拟建设内容
    private String reserveMqgzjd;//目前工作进度
    private String reserveGczxjg;//工程咨询机构
    private String reserveYjdddegzjd;//本年底前达到的工作进度
    private String reserveMqgzjdms;//目前工作进度描述
    private String reserveCbbm;//储备部门（报送单位）
    private String reserveBssj;//报送时间

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_number")
    private Project project;//项目


    public Reserve() {
    }

    public Integer getReserveNumber() {
        return reserveNumber;
    }

    public void setReserveNumber(Integer reserveNumber) {
        this.reserveNumber = reserveNumber;
    }

    public String getReservePc() {
        return reservePc;
    }

    public void setReservePc(String reservePc) {
        this.reservePc = reservePc;
    }

    public Boolean getReserveIsdszqzc() {
        return reserveIsdszqzc;
    }

    public void setReserveIsdszqzc(Boolean reserveIsdszqzc) {
        this.reserveIsdszqzc = reserveIsdszqzc;
    }

    public String getReserveState() {
        return reserveState;
    }

    public void setReserveState(String reserveState) {
        this.reserveState = reserveState;
    }

    public String getReserveRksj() {
        return reserveRksj;
    }

    public void setReserveRksj(String reserveRksj) {
        this.reserveRksj = reserveRksj;
    }

    public String getReserveCbjd() {
        return reserveCbjd;
    }

    public void setReserveCbjd(String reserveCbjd) {
        this.reserveCbjd = reserveCbjd;
    }

    public String getReserveTzfs() {
        return reserveTzfs;
    }

    public void setReserveTzfs(String reserveTzfs) {
        this.reserveTzfs = reserveTzfs;
    }

    public String getReserveXmyt() {
        return reserveXmyt;
    }

    public void setReserveXmyt(String reserveXmyt) {
        this.reserveXmyt = reserveXmyt;
    }

    public String getReserveXdzj() {
        return reserveXdzj;
    }

    public void setReserveXdzj(String reserveXdzj) {
        this.reserveXdzj = reserveXdzj;
    }

    public String getReserveHyghmc() {
        return reserveHyghmc;
    }

    public void setReserveHyghmc(String reserveHyghmc) {
        this.reserveHyghmc = reserveHyghmc;
    }

    public String getReserveSshy() {
        return reserveSshy;
    }

    public void setReserveSshy(String reserveSshy) {
        this.reserveSshy = reserveSshy;
    }

    public String getReserveNjsdd() {
        return reserveNjsdd;
    }

    public void setReserveNjsdd(String reserveNjsdd) {
        this.reserveNjsdd = reserveNjsdd;
    }

    public String getReserveKsztz() {
        return reserveKsztz;
    }

    public void setReserveKsztz(String reserveKsztz) {
        this.reserveKsztz = reserveKsztz;
    }

    public String getReserveJsbyx() {
        return reserveJsbyx;
    }

    public void setReserveJsbyx(String reserveJsbyx) {
        this.reserveJsbyx = reserveJsbyx;
    }

    public String getReserveNjsnr() {
        return reserveNjsnr;
    }

    public void setReserveNjsnr(String reserveNjsnr) {
        this.reserveNjsnr = reserveNjsnr;
    }

    public String getReserveMqgzjd() {
        return reserveMqgzjd;
    }

    public void setReserveMqgzjd(String reserveMqgzjd) {
        this.reserveMqgzjd = reserveMqgzjd;
    }

    public String getReserveGczxjg() {
        return reserveGczxjg;
    }

    public void setReserveGczxjg(String reserveGczxjg) {
        this.reserveGczxjg = reserveGczxjg;
    }

    public String getReserveYjdddegzjd() {
        return reserveYjdddegzjd;
    }

    public void setReserveYjdddegzjd(String reserveYjdddegzjd) {
        this.reserveYjdddegzjd = reserveYjdddegzjd;
    }

    public String getReserveMqgzjdms() {
        return reserveMqgzjdms;
    }

    public void setReserveMqgzjdms(String reserveMqgzjdms) {
        this.reserveMqgzjdms = reserveMqgzjdms;
    }

    public String getReserveCbbm() {
        return reserveCbbm;
    }

    public void setReserveCbbm(String reserveCbbm) {
        this.reserveCbbm = reserveCbbm;
    }

    public String getReserveBssj() {
        return reserveBssj;
    }

    public void setReserveBssj(String reserveBssj) {
        this.reserveBssj = reserveBssj;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}