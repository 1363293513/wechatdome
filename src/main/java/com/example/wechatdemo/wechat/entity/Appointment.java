package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {

    /**
     *  持有预约该医生的用户表
     * */
    private User user;

    /**
     * 根据状态显示预约状态 待办 成功 失败
     * */
    private String state;


    /**
     * 新增医生名字，要将数据扭转到前端
    * */
    private Doctor doctor;

    /**
     * 新增病人的手机号码
     * */
    private String phoneForPatient;

    /**
    * 新病人 or 老病人
    * */
    private String type;

    private Integer aid;

    private Integer uid;

    private Integer did;

    private String ayuyuename;

    private String aemail;

    private Date atime;

    private String amoneny;

    private String astate;

    //这个代替atime 预约时间
    private String ary1;


    private String ary2;

    private String ary3;

    private Integer ary4;

    private Date ary5;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getPhoneForPatient() {
        return phoneForPatient;
    }

    public void setPhoneForPatient(String phoneForPatient) {
        this.phoneForPatient = phoneForPatient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getAyuyuename() {
        return ayuyuename;
    }

    public void setAyuyuename(String ayuyuename) {
        this.ayuyuename = ayuyuename == null ? null : ayuyuename.trim();
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail == null ? null : aemail.trim();
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public String getAmoneny() {
        return amoneny;
    }

    public void setAmoneny(String amoneny) {
        this.amoneny = amoneny == null ? null : amoneny.trim();
    }

    public String getAstate() {
        return astate;
    }

    public void setAstate(String astate) {
        this.astate = astate == null ? null : astate.trim();
    }

    public String getAry1() {
        return ary1;
    }

    public void setAry1(String ary1) {
        this.ary1 = ary1 == null ? null : ary1.trim();
    }

    public String getAry2() {
        return ary2;
    }

    public void setAry2(String ary2) {
        this.ary2 = ary2 == null ? null : ary2.trim();
    }

    public String getAry3() {
        return ary3;
    }

    public void setAry3(String ary3) {
        this.ary3 = ary3 == null ? null : ary3.trim();
    }

    public Integer getAry4() {
        return ary4;
    }

    public void setAry4(Integer ary4) {
        this.ary4 = ary4;
    }

    public Date getAry5() {
        return ary5;
    }

    public void setAry5(Date ary5) {
        this.ary5 = ary5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", uid=").append(uid);
        sb.append(", did=").append(did);
        sb.append(", ayuyuename=").append(ayuyuename);
        sb.append(", aemail=").append(aemail);
        sb.append(", atime=").append(atime);
        sb.append(", amoneny=").append(amoneny);
        sb.append(", astate=").append(astate);
        sb.append(", ary1=").append(ary1);
        sb.append(", ary2=").append(ary2);
        sb.append(", ary3=").append(ary3);
        sb.append(", ary4=").append(ary4);
        sb.append(", ary5=").append(ary5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}