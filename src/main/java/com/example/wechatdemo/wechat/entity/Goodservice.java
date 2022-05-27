package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;

public class Goodservice implements Serializable {
    private Integer id;

    private Integer parentid;

    private String name;

    private String description;

    private String gsry1;

    private String gsry2;

    private String gsry3;

    private String gsry4;

    private Integer gsry5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getGsry1() {
        return gsry1;
    }

    public void setGsry1(String gsry1) {
        this.gsry1 = gsry1 == null ? null : gsry1.trim();
    }

    public String getGsry2() {
        return gsry2;
    }

    public void setGsry2(String gsry2) {
        this.gsry2 = gsry2 == null ? null : gsry2.trim();
    }

    public String getGsry3() {
        return gsry3;
    }

    public void setGsry3(String gsry3) {
        this.gsry3 = gsry3 == null ? null : gsry3.trim();
    }

    public String getGsry4() {
        return gsry4;
    }

    public void setGsry4(String gsry4) {
        this.gsry4 = gsry4 == null ? null : gsry4.trim();
    }

    public Integer getGsry5() {
        return gsry5;
    }

    public void setGsry5(Integer gsry5) {
        this.gsry5 = gsry5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentid=").append(parentid);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", gsry1=").append(gsry1);
        sb.append(", gsry2=").append(gsry2);
        sb.append(", gsry3=").append(gsry3);
        sb.append(", gsry4=").append(gsry4);
        sb.append(", gsry5=").append(gsry5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}