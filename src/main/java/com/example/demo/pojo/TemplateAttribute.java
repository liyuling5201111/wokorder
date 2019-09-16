package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TemplateAttribute implements Serializable {
    private Integer id;

    private String url;

    private Integer roleid;

    private String rolename;

    private Byte timeout;

    private Date createtime;

    private Date updatetime;

    private Integer templateId;

    private Integer nodeCode;

    private String nodeName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Byte getTimeout() {
        return timeout;
    }

    public void setTimeout(Byte timeout) {
        this.timeout = timeout;
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

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(Integer nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", roleid=").append(roleid);
        sb.append(", rolename=").append(rolename);
        sb.append(", timeout=").append(timeout);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", templateId=").append(templateId);
        sb.append(", nodeCode=").append(nodeCode);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}