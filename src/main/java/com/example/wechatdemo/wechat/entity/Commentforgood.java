package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;

public class Commentforgood implements Serializable {
    private Integer id;

    private Integer commentid;

    private Integer goodid;

    private Integer userid;

    private String userface;

    private String content;

    private String date;

    private String spec;

    private String grade;

    private String img;

    private String addtwocontent;

    private String addtwoimg;

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

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface == null ? null : userface.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getAddtwocontent() {
        return addtwocontent;
    }

    public void setAddtwocontent(String addtwocontent) {
        this.addtwocontent = addtwocontent == null ? null : addtwocontent.trim();
    }

    public String getAddtwoimg() {
        return addtwoimg;
    }

    public void setAddtwoimg(String addtwoimg) {
        this.addtwoimg = addtwoimg == null ? null : addtwoimg.trim();
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
        sb.append(", commentid=").append(commentid);
        sb.append(", goodid=").append(goodid);
        sb.append(", userid=").append(userid);
        sb.append(", userface=").append(userface);
        sb.append(", content=").append(content);
        sb.append(", date=").append(date);
        sb.append(", spec=").append(spec);
        sb.append(", grade=").append(grade);
        sb.append(", img=").append(img);
        sb.append(", addtwocontent=").append(addtwocontent);
        sb.append(", addtwoimg=").append(addtwoimg);
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