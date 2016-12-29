package com.zigong.model.project;

import javax.persistence.*;

/**项目
 * Created by 罗健 on 2016/12/28.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer project_number; //项目编号

    private String project_name; //项目名称

    private Integer project_owner;//项目业主
    private Integer project_fddbr;//项目法人代表
    private Integer project_bslxr;//项目报送联系人
    private Integer project_bslxrdh;//项目报送联系人手机

    private String project_fgld;//分管领导
    private String project_bsdw;//报送单位
    private String project_sjhyglbm;//市级行业主管部门
    private String project_zrbm;//责任部门

    private String project_szqx;//所在区县
    private String project_state;//建设状态
    private String project_yjztz;//预计总投资
    private String project_jsxz;//建设性质
    private String project_jscsnx;//建设初始年
    private String project_jszznx;//建设最终年
    private String project_address;//建设地址
    private String project_content;//建设内容
    private String project_background;//建设背景
    private String project_yjjjhshxy;//预计经济和社会效益
    private String project_jhkgsj;//计划开工时间
    private String project_sjkgsj;//实际开工时间
    private String project_jhjgsj;//计划竣工时间
    private String project_sjjgsj;//实际竣工时间

    private Boolean project_izsyzxm;//是否招商引资项目
    private Boolean project_isgzxm;//是否国债项目
    private Boolean project_isyjxm;//是否引进项目
    private Boolean project_iszftz;//是否政府投资项目
    private String project_xmfl;//项目分类
    private String project_qxxmfl;//区县项目分类
    private Boolean project_isjnjp;//是否节能减排项目
    private Boolean project_isxxcy;//是否新兴产业
    private String project_xxcyfl;//新兴产业分类
    private String project_sssjzlgnq;//所属市级战略功能区

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "project")
    private Reserve reserve;//储备项目信息
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "project")
    private Zsyzxm zsyzxm;//招商引资项目管理

    public Project() {
    }

    public Integer getProject_number() {
        return project_number;
    }

    public void setProject_number(Integer project_number) {
        this.project_number = project_number;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Integer getProject_owner() {
        return project_owner;
    }

    public void setProject_owner(Integer project_owner) {
        this.project_owner = project_owner;
    }

    public Integer getProject_fddbr() {
        return project_fddbr;
    }

    public void setProject_fddbr(Integer project_fddbr) {
        this.project_fddbr = project_fddbr;
    }

    public Integer getProject_bslxr() {
        return project_bslxr;
    }

    public void setProject_bslxr(Integer project_bslxr) {
        this.project_bslxr = project_bslxr;
    }

    public Integer getProject_bslxrdh() {
        return project_bslxrdh;
    }

    public void setProject_bslxrdh(Integer project_bslxrdh) {
        this.project_bslxrdh = project_bslxrdh;
    }

    public String getProject_fgld() {
        return project_fgld;
    }

    public void setProject_fgld(String project_fgld) {
        this.project_fgld = project_fgld;
    }

    public String getProject_bsdw() {
        return project_bsdw;
    }

    public void setProject_bsdw(String project_bsdw) {
        this.project_bsdw = project_bsdw;
    }

    public String getProject_sjhyglbm() {
        return project_sjhyglbm;
    }

    public void setProject_sjhyglbm(String project_sjhyglbm) {
        this.project_sjhyglbm = project_sjhyglbm;
    }

    public String getProject_zrbm() {
        return project_zrbm;
    }

    public void setProject_zrbm(String project_zrbm) {
        this.project_zrbm = project_zrbm;
    }

    public String getProject_szqx() {
        return project_szqx;
    }

    public void setProject_szqx(String project_szqx) {
        this.project_szqx = project_szqx;
    }

    public String getProject_state() {
        return project_state;
    }

    public void setProject_state(String project_state) {
        this.project_state = project_state;
    }

    public String getProject_yjztz() {
        return project_yjztz;
    }

    public void setProject_yjztz(String project_yjztz) {
        this.project_yjztz = project_yjztz;
    }

    public String getProject_jsxz() {
        return project_jsxz;
    }

    public void setProject_jsxz(String project_jsxz) {
        this.project_jsxz = project_jsxz;
    }

    public String getProject_jscsnx() {
        return project_jscsnx;
    }

    public void setProject_jscsnx(String project_jscsnx) {
        this.project_jscsnx = project_jscsnx;
    }

    public String getProject_jszznx() {
        return project_jszznx;
    }

    public void setProject_jszznx(String project_jszznx) {
        this.project_jszznx = project_jszznx;
    }

    public String getProject_address() {
        return project_address;
    }

    public void setProject_address(String project_address) {
        this.project_address = project_address;
    }

    public String getProject_content() {
        return project_content;
    }

    public void setProject_content(String project_content) {
        this.project_content = project_content;
    }

    public String getProject_background() {
        return project_background;
    }

    public void setProject_background(String project_background) {
        this.project_background = project_background;
    }

    public String getProject_yjjjhshxy() {
        return project_yjjjhshxy;
    }

    public void setProject_yjjjhshxy(String project_yjjjhshxy) {
        this.project_yjjjhshxy = project_yjjjhshxy;
    }

    public String getProject_jhkgsj() {
        return project_jhkgsj;
    }

    public void setProject_jhkgsj(String project_jhkgsj) {
        this.project_jhkgsj = project_jhkgsj;
    }

    public String getProject_sjkgsj() {
        return project_sjkgsj;
    }

    public void setProject_sjkgsj(String project_sjkgsj) {
        this.project_sjkgsj = project_sjkgsj;
    }

    public String getProject_jhjgsj() {
        return project_jhjgsj;
    }

    public void setProject_jhjgsj(String project_jhjgsj) {
        this.project_jhjgsj = project_jhjgsj;
    }

    public String getProject_sjjgsj() {
        return project_sjjgsj;
    }

    public void setProject_sjjgsj(String project_sjjgsj) {
        this.project_sjjgsj = project_sjjgsj;
    }

    public Boolean getProject_izsyzxm() {
        return project_izsyzxm;
    }

    public void setProject_izsyzxm(Boolean project_izsyzxm) {
        this.project_izsyzxm = project_izsyzxm;
    }

    public Boolean getProject_isgzxm() {
        return project_isgzxm;
    }

    public void setProject_isgzxm(Boolean project_isgzxm) {
        this.project_isgzxm = project_isgzxm;
    }

    public Boolean getProject_isyjxm() {
        return project_isyjxm;
    }

    public void setProject_isyjxm(Boolean project_isyjxm) {
        this.project_isyjxm = project_isyjxm;
    }

    public Boolean getProject_iszftz() {
        return project_iszftz;
    }

    public void setProject_iszftz(Boolean project_iszftz) {
        this.project_iszftz = project_iszftz;
    }

    public String getProject_xmfl() {
        return project_xmfl;
    }

    public void setProject_xmfl(String project_xmfl) {
        this.project_xmfl = project_xmfl;
    }

    public String getProject_qxxmfl() {
        return project_qxxmfl;
    }

    public void setProject_qxxmfl(String project_qxxmfl) {
        this.project_qxxmfl = project_qxxmfl;
    }

    public Boolean getProject_isjnjp() {
        return project_isjnjp;
    }

    public void setProject_isjnjp(Boolean project_isjnjp) {
        this.project_isjnjp = project_isjnjp;
    }

    public Boolean getProject_isxxcy() {
        return project_isxxcy;
    }

    public void setProject_isxxcy(Boolean project_isxxcy) {
        this.project_isxxcy = project_isxxcy;
    }

    public String getProject_xxcyfl() {
        return project_xxcyfl;
    }

    public void setProject_xxcyfl(String project_xxcyfl) {
        this.project_xxcyfl = project_xxcyfl;
    }

    public String getProject_sssjzlgnq() {
        return project_sssjzlgnq;
    }

    public void setProject_sssjzlgnq(String project_sssjzlgnq) {
        this.project_sssjzlgnq = project_sssjzlgnq;
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