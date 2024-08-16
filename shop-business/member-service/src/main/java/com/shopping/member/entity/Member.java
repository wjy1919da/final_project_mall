package com.shopping.member.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(Member)实体类
 *
 * @author makejava
 * @since 2024-08-16 23:19:13
 */
@Entity // 表示这是一个实体类
@Data
@NoArgsConstructor
@Table(name = "member")
public class Member implements Serializable {
    /**
     * 会员表的主键
     */
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略，使用数据库自增主键
    private Integer id;
/**
     * ID
     */
    private String openId;
/**
     * 用户昵称
     */
    private String nickName;
/**
     * 真实姓名
     */
    private String realName;
/**
     * 用户邮箱
     */
    private String userMail;
/**
     * 支付密码
     */
    private String payPassword;
/**
     * 手机号码
     */
    private String userMobile;
/**
     * 修改时间
     */
    private Date updateTime;
/**
     * 注册时间
     */
    private Date createTime;
/**
     * 注册IP
     */
    private String userRegip;
/**
     * 最后登录时间
     */
    private Date userLasttime;
/**
     * 最后登录IP
     */
    private String userLastip;
/**
     * M(男) or F(女)
     */
    private String sex;
/**
     * 例如：2009-11-27
     */
    private String birthDate;
/**
     * 头像图片路径
     */
    private String pic;
/**
     * 状态 1 正常 0 无效
     */
    private Integer status;
/**
     * 用户积分
     */
    private Integer score;

}

