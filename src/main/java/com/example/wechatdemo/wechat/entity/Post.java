package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
    //持有user表
    private User user;

    private Integer pid;

    private String pcontent;

    private String ptag;

    private String ppic;

    private Date ptime;

    private Integer uid;

    private String pry1;

    private String pry2;

    private String pry3;

    private Integer pry4;

    private Date pry5;

    private static final long serialVersionUID = 1L;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent == null ? null : pcontent.trim();
    }

    public String getPtag() {
        return ptag;
    }

    public void setPtag(String ptag) {
        this.ptag = ptag == null ? null : ptag.trim();
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic == null ? null : ppic.trim();
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPry1() {
        return pry1;
    }

    public void setPry1(String pry1) {
        this.pry1 = pry1 == null ? null : pry1.trim();
    }

    public String getPry2() {
        return pry2;
    }

    public void setPry2(String pry2) {
        this.pry2 = pry2 == null ? null : pry2.trim();
    }

    public String getPry3() {
        return pry3;
    }

    public void setPry3(String pry3) {
        this.pry3 = pry3 == null ? null : pry3.trim();
    }

    public Integer getPry4() {
        return pry4;
    }

    public void setPry4(Integer pry4) {
        this.pry4 = pry4;
    }

    public Date getPry5() {
        return pry5;
    }

    public void setPry5(Date pry5) {
        this.pry5 = pry5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pcontent=").append(pcontent);
        sb.append(", ptag=").append(ptag);
        sb.append(", ppic=").append(ppic);
        sb.append(", ptime=").append(ptime);
        sb.append(", uid=").append(uid);
        sb.append(", pry1=").append(pry1);
        sb.append(", pry2=").append(pry2);
        sb.append(", pry3=").append(pry3);
        sb.append(", pry4=").append(pry4);
        sb.append(", pry5=").append(pry5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}