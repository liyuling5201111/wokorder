package com.example.demo.pojo;

import java.io.Serializable;

public class Workorder implements Serializable {
    private Integer id;

    private String wrcode;

    private Integer userId;

    private String wrtype;

    private Integer templateId;

    private Byte wrstate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWrcode() {
        return wrcode;
    }

    public void setWrcode(String wrcode) {
        this.wrcode = wrcode == null ? null : wrcode.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWrtype() {
        return wrtype;
    }

    public void setWrtype(String wrtype) {
        this.wrtype = wrtype == null ? null : wrtype.trim();
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Byte getWrstate() {
        return wrstate;
    }

    public void setWrstate(Byte wrstate) {
        this.wrstate = wrstate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wrcode=").append(wrcode);
        sb.append(", userId=").append(userId);
        sb.append(", wrtype=").append(wrtype);
        sb.append(", templateId=").append(templateId);
        sb.append(", wrstate=").append(wrstate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}