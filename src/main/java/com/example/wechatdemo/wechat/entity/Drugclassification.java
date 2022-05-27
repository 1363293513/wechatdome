package com.example.wechatdemo.wechat.entity;

import java.io.Serializable;

public class Drugclassification implements Serializable {
    private Integer id;

    private Integer drugclassid;

    private String title;

    private String dcry1;

    private String dcry2;

    private String dcry3;

    private String dcry4;

    private Integer dcry5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugclassid() {
        return drugclassid;
    }

    public void setDrugclassid(Integer drugclassid) {
        this.drugclassid = drugclassid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDcry1() {
        return dcry1;
    }

    public void setDcry1(String dcry1) {
        this.dcry1 = dcry1 == null ? null : dcry1.trim();
    }

    public String getDcry2() {
        return dcry2;
    }

    public void setDcry2(String dcry2) {
        this.dcry2 = dcry2 == null ? null : dcry2.trim();
    }

    public String getDcry3() {
        return dcry3;
    }

    public void setDcry3(String dcry3) {
        this.dcry3 = dcry3 == null ? null : dcry3.trim();
    }

    public String getDcry4() {
        return dcry4;
    }

    public void setDcry4(String dcry4) {
        this.dcry4 = dcry4 == null ? null : dcry4.trim();
    }

    public Integer getDcry5() {
        return dcry5;
    }

    public void setDcry5(Integer dcry5) {
        this.dcry5 = dcry5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugclassid=").append(drugclassid);
        sb.append(", title=").append(title);
        sb.append(", dcry1=").append(dcry1);
        sb.append(", dcry2=").append(dcry2);
        sb.append(", dcry3=").append(dcry3);
        sb.append(", dcry4=").append(dcry4);
        sb.append(", dcry5=").append(dcry5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}