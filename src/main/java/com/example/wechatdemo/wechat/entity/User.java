package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {


    private Doctor doctor;

    private Integer uid;

    private String ustate;

    private String uname;

    private Integer uage;

    private String upicture;

    private String uemail;

    private String upwd;

    private String uphone;

    private String usex;

    private String ury1;

    private String ury2;

    private String ury3;

    private Integer ury4;

    private Date ury5;

    public User(Integer uid, String ustate, String uname, Integer uage, String upicture, String uemail, String upwd, String uphone, String usex, String ury1, String ury2, String ury3, Integer ury4, Date ury5) {
        this.uid = uid;
        this.ustate = ustate;
        this.uname = uname;
        this.uage = uage;
        this.upicture = upicture;
        this.uemail = uemail;
        this.upwd = upwd;
        this.uphone = uphone;
        this.usex = usex;
        this.ury1 = ury1;
        this.ury2 = ury2;
        this.ury3 = ury3;
        this.ury4 = ury4;
        this.ury5 = ury5;
    }

    public User() {

    }


    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate == null ? null : ustate.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUpicture() {
        return upicture;
    }

    public void setUpicture(String upicture) {
        this.upicture = upicture == null ? null : upicture.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public String getUry1() {
        return ury1;
    }

    public void setUry1(String ury1) {
        this.ury1 = ury1 == null ? null : ury1.trim();
    }

    public String getUry2() {
        return ury2;
    }

    public void setUry2(String ury2) {
        this.ury2 = ury2 == null ? null : ury2.trim();
    }

    public String getUry3() {
        return ury3;
    }

    public void setUry3(String ury3) {
        this.ury3 = ury3 == null ? null : ury3.trim();
    }

    public Integer getUry4() {
        return ury4;
    }

    public void setUry4(Integer ury4) {
        this.ury4 = ury4;
    }

    public Date getUry5() {
        return ury5;
    }

    public void setUry5(Date ury5) {
        this.ury5 = ury5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", ustate=").append(ustate);
        sb.append(", uname=").append(uname);
        sb.append(", uage=").append(uage);
        sb.append(", upicture=").append(upicture);
        sb.append(", uemail=").append(uemail);
        sb.append(", upwd=").append(upwd);
        sb.append(", uphone=").append(uphone);
        sb.append(", usex=").append(usex);
        sb.append(", ury1=").append(ury1);
        sb.append(", ury2=").append(ury2);
        sb.append(", ury3=").append(ury3);
        sb.append(", ury4=").append(ury4);
        sb.append(", ury5=").append(ury5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}