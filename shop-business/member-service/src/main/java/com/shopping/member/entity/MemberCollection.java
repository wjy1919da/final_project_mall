package com.shopping.member.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * (MemberCollection)实体类
 *
 * @author makejava
 * @since 2024-08-16 23:19:28
 */
@Entity // 表示这是一个实体类
@Data
@NoArgsConstructor
@Table(name = "member_collection")
public class MemberCollection implements Serializable {
    private static final long serialVersionUID = -95959484809349151L;
    /**
     * 收藏表
     */
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略，使用数据库自增主键
    private Long id;
/**
     * 商品id
     */
    private Long prodId;
/**
     * 用户id
     */
    private String openId;
/**
     * 收藏时间
     */
    private Date createTime;


}

