package com.shopping.order.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 增加租户字段(ConfigInfoAggr)实体类
 *
 * @author makejava
 * @since 2024-08-13 23:30:08
 */
@Data
public class ConfigInfoAggr implements Serializable {
    private static final long serialVersionUID = 834307883024750933L;
    /**
     * id
     */
    private Long id;
    /**
     * data_id
     */
    private String dataId;
    /**
     * group_id
     */
    private String groupId;
    /**
     * datum_id
     */
    private String datumId;
    /**
     * 内容
     */
    private String content;
    /**
     * 修改时间
     */
    private Date gmtModified;

    private String appName;
    /**
     * 租户字段
     */
    private String tenantId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDatumId() {
        return datumId;
    }

    public void setDatumId(String datumId) {
        this.datumId = datumId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

}

