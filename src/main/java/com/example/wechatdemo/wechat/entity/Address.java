package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer id;

    private Integer userid;

    private String username;

    private String telphone;

    private String label;

    private String detail;

    private Integer isdefault;

    private String ry1;

    private String ry2;

    private String ry3;

    private String ry4;

    private Integer ry5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public String getRy1() {
        return ry1;
    }

    public void setRy1(String ry1) {
        this.ry1 = ry1 == null ? null : ry1.trim();
    }

    public String getRy2() {
        return ry2;
    }

    public void setRy2(String ry2) {
        this.ry2 = ry2 == null ? null : ry2.trim();
    }

    public String getRy3() {
        return ry3;
    }

    public void setRy3(String ry3) {
        this.ry3 = ry3 == null ? null : ry3.trim();
    }

    public String getRy4() {
        return ry4;
    }

    public void setRy4(String ry4) {
        this.ry4 = ry4 == null ? null : ry4.trim();
    }

    public Integer getRy5() {
        return ry5;
    }

    public void setRy5(Integer ry5) {
        this.ry5 = ry5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", telphone=").append(telphone);
        sb.append(", label=").append(label);
        sb.append(", detail=").append(detail);
        sb.append(", isdefault=").append(isdefault);
        sb.append(", ry1=").append(ry1);
        sb.append(", ry2=").append(ry2);
        sb.append(", ry3=").append(ry3);
        sb.append(", ry4=").append(ry4);
        sb.append(", ry5=").append(ry5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}