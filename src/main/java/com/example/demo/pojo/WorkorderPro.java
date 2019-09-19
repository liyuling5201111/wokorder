package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class WorkorderPro implements Serializable {
    private Integer id;

    private Byte state;

    private Byte executeOrder;

    private Integer userId;

    private String nodename;

    private Date createtime;

    private Date updatetime;

    private String wrcode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getExecuteOrder() {
        return executeOrder;
    }

    public void setExecuteOrder(Byte executeOrder) {
        this.executeOrder = executeOrder;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getWrcode() {
        return wrcode;
    }

    public void setWrcode(String wrcode) {
        this.wrcode = wrcode == null ? null : wrcode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", state=").append(state);
        sb.append(", executeOrder=").append(executeOrder);
        sb.append(", userId=").append(userId);
        sb.append(", nodename=").append(nodename);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", wrcode=").append(wrcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}