package com.shopping.member.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 用户配送地址(MemberAddr)实体类
 *
 * @author makejava
 * @since 2024-08-16 23:19:28
 */
@Entity // 表示这是一个实体类
@Data
@NoArgsConstructor
@Table(name = "member_addr")
public class MemberAddr implements Serializable {
    /**
     * ID
     */
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略，使用数据库自增主键
    private Integer addrId;
/**
     * 用户ID
     */
    private String openId;
/**
     * 收货人
     */
    private String receiver;
/**
     * 省ID
     */
    private Long provinceId;
/**
     * 省
     */
    private String province;
/**
     * 城市
     */
    private String city;
/**
     * 城市ID
     */
    private Long cityId;
/**
     * 区
     */
    private String area;
/**
     * 区ID
     */
    private Long areaId;
/**
     * 邮编
     */
    private String postCode;
/**
     * 地址
     */
    private String addr;
/**
     * 手机
     */
    private String mobile;
/**
     * 状态,1正常，0无效
     */
    private Integer status;
/**
     * 是否默认地址 1是
     */
    private Integer commonAddr;
/**
     * 建立时间
     */
    private Date createTime;
/**
     * 更新时间
     */
    private Date updateTime;



}

