package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;

public class Drugsegmentation implements Serializable {
    private Integer id;

    private Integer drugsegid;

    private Integer parentid;

    private String name;

    private String img;

    private String dscr1;

    private String dscr2;

    private String dscr3;

    private String dscr4;

    private Integer dscr5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugsegid() {
        return drugsegid;
    }

    public void setDrugsegid(Integer drugsegid) {
        this.drugsegid = drugsegid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDscr1() {
        return dscr1;
    }

    public void setDscr1(String dscr1) {
        this.dscr1 = dscr1 == null ? null : dscr1.trim();
    }

    public String getDscr2() {
        return dscr2;
    }

    public void setDscr2(String dscr2) {
        this.dscr2 = dscr2 == null ? null : dscr2.trim();
    }

    public String getDscr3() {
        return dscr3;
    }

    public void setDscr3(String dscr3) {
        this.dscr3 = dscr3 == null ? null : dscr3.trim();
    }

    public String getDscr4() {
        return dscr4;
    }

    public void setDscr4(String dscr4) {
        this.dscr4 = dscr4 == null ? null : dscr4.trim();
    }

    public Integer getDscr5() {
        return dscr5;
    }

    public void setDscr5(Integer dscr5) {
        this.dscr5 = dscr5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugsegid=").append(drugsegid);
        sb.append(", parentid=").append(parentid);
        sb.append(", name=").append(name);
        sb.append(", img=").append(img);
        sb.append(", dscr1=").append(dscr1);
        sb.append(", dscr2=").append(dscr2);
        sb.append(", dscr3=").append(dscr3);
        sb.append(", dscr4=").append(dscr4);
        sb.append(", dscr5=").append(dscr5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}