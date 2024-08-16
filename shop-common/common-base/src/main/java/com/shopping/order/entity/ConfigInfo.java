package com.shopping.order.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * config_info(ConfigInfo)实体类
 *
 * @author makejava
 * @since 2024-08-13 23:25:41
 */
@Data
public class ConfigInfo implements Serializable {
    private static final long serialVersionUID = 115564197615928971L;
    /**
     * id
     */
    private Long id;
    /**
     * data_id
     */
    private String dataId;

    private String groupId;
    /**
     * content
     */
    private String content;
    /**
     * md5
     */
    private String md5;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * source user
     */
    private String srcUser;
    /**
     * source ip
     */
    private String srcIp;

    private String appName;
    /**
     * 租户字段
     */
    private String tenantId;

    private String cDesc;

    private String cUse;

    private String effect;

    private String type;

    private String cSchema;
    /**
     * 秘钥
     */
    private String encryptedDataKey;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getSrcUser() {
        return srcUser;
    }

    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
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

    public String getCDesc() {
        return cDesc;
    }

    public void setCDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public String getCUse() {
        return cUse;
    }

    public void setCUse(String cUse) {
        this.cUse = cUse;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCSchema() {
        return cSchema;
    }

    public void setCSchema(String cSchema) {
        this.cSchema = cSchema;
    }

    public String getEncryptedDataKey() {
        return encryptedDataKey;
    }

    public void setEncryptedDataKey(String encryptedDataKey) {
        this.encryptedDataKey = encryptedDataKey;
    }

}

