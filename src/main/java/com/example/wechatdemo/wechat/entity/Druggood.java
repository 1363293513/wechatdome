package com.example.wechatdemo.wechat.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;

@Document(indexName = "product_item",shards = 2,replicas = 1,type = "tbitem")
public class Druggood implements Serializable {
    @Id
    private Integer id;

    private Integer druggoodid;

    private String img;

    @Field(name = "name",type = FieldType.Text,analyzer = "ik_smart",fielddata = true)
    private String name;

    private BigDecimal price;

    private String slogan;

    private Integer parentid;

    private Integer parentparentid;

    private String dgry1;

    private String dgry2;

    private String dgry3;

    private String dgry4;

    private Integer dgry5;


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDruggoodid() {
        return druggoodid;
    }

    public void setDruggoodid(Integer druggoodid) {
        this.druggoodid = druggoodid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan == null ? null : slogan.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getParentparentid() {
        return parentparentid;
    }

    public void setParentparentid(Integer parentparentid) {
        this.parentparentid = parentparentid;
    }

    public String getDgry1() {
        return dgry1;
    }

    public void setDgry1(String dgry1) {
        this.dgry1 = dgry1 == null ? null : dgry1.trim();
    }

    public String getDgry2() {
        return dgry2;
    }

    public void setDgry2(String dgry2) {
        this.dgry2 = dgry2 == null ? null : dgry2.trim();
    }

    public String getDgry3() {
        return dgry3;
    }

    public void setDgry3(String dgry3) {
        this.dgry3 = dgry3 == null ? null : dgry3.trim();
    }

    public String getDgry4() {
        return dgry4;
    }

    public void setDgry4(String dgry4) {
        this.dgry4 = dgry4 == null ? null : dgry4.trim();
    }

    public Integer getDgry5() {
        return dgry5;
    }

    public void setDgry5(Integer dgry5) {
        this.dgry5 = dgry5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", druggoodid=").append(druggoodid);
        sb.append(", img=").append(img);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", slogan=").append(slogan);
        sb.append(", parentid=").append(parentid);
        sb.append(", parentparentid=").append(parentparentid);
        sb.append(", dgry1=").append(dgry1);
        sb.append(", dgry2=").append(dgry2);
        sb.append(", dgry3=").append(dgry3);
        sb.append(", dgry4=").append(dgry4);
        sb.append(", dgry5=").append(dgry5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}