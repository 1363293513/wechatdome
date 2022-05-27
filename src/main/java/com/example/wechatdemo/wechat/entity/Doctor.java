package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;
import java.util.Date;

public class Doctor implements Serializable {
    //持有用户表
    private User user;

    private Integer did;

    private String doffice;

    private String drank;

    private String dqualification;

    private String ddescript;

    private String deducation;

    private String dexperience;

    private String dwards;

    private String dgoodat;

    private String dhospital;

    private String daddress;

    private Integer uid;

    private String dry1;

    private String dry2;

    private String dry3;

    private String dry4;

    private Date dry5;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDoffice() {
        return doffice;
    }

    public void setDoffice(String doffice) {
        this.doffice = doffice == null ? null : doffice.trim();
    }

    public String getDrank() {
        return drank;
    }

    public void setDrank(String drank) {
        this.drank = drank == null ? null : drank.trim();
    }

    public String getDqualification() {
        return dqualification;
    }

    public void setDqualification(String dqualification) {
        this.dqualification = dqualification == null ? null : dqualification.trim();
    }

    public String getDdescript() {
        return ddescript;
    }

    public void setDdescript(String ddescript) {
        this.ddescript = ddescript == null ? null : ddescript.trim();
    }

    public String getDeducation() {
        return deducation;
    }

    public void setDeducation(String deducation) {
        this.deducation = deducation == null ? null : deducation.trim();
    }

    public String getDexperience() {
        return dexperience;
    }

    public void setDexperience(String dexperience) {
        this.dexperience = dexperience == null ? null : dexperience.trim();
    }

    public String getDwards() {
        return dwards;
    }

    public void setDwards(String dwards) {
        this.dwards = dwards == null ? null : dwards.trim();
    }

    public String getDgoodat() {
        return dgoodat;
    }

    public void setDgoodat(String dgoodat) {
        this.dgoodat = dgoodat == null ? null : dgoodat.trim();
    }

    public String getDhospital() {
        return dhospital;
    }

    public void setDhospital(String dhospital) {
        this.dhospital = dhospital == null ? null : dhospital.trim();
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress == null ? null : daddress.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getDry1() {
        return dry1;
    }

    public void setDry1(String dry1) {
        this.dry1 = dry1 == null ? null : dry1.trim();
    }

    public String getDry2() {
        return dry2;
    }

    public void setDry2(String dry2) {
        this.dry2 = dry2 == null ? null : dry2.trim();
    }

    public String getDry3() {
        return dry3;
    }

    public void setDry3(String dry3) {
        this.dry3 = dry3 == null ? null : dry3.trim();
    }

    public String getDry4() {
        return dry4;
    }

    public void setDry4(String dry4) {
        this.dry4 = dry4 == null ? null : dry4.trim();
    }

    public Date getDry5() {
        return dry5;
    }

    public void setDry5(Date dry5) {
        this.dry5 = dry5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", did=").append(did);
        sb.append(", doffice=").append(doffice);
        sb.append(", drank=").append(drank);
        sb.append(", dqualification=").append(dqualification);
        sb.append(", ddescript=").append(ddescript);
        sb.append(", deducation=").append(deducation);
        sb.append(", dexperience=").append(dexperience);
        sb.append(", dwards=").append(dwards);
        sb.append(", dgoodat=").append(dgoodat);
        sb.append(", dhospital=").append(dhospital);
        sb.append(", daddress=").append(daddress);
        sb.append(", uid=").append(uid);
        sb.append(", dry1=").append(dry1);
        sb.append(", dry2=").append(dry2);
        sb.append(", dry3=").append(dry3);
        sb.append(", dry4=").append(dry4);
        sb.append(", dry5=").append(dry5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}