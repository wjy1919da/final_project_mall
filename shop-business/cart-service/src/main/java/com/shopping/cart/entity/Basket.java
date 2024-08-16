package com.shopping.cart.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 购物车(Basket)实体类
 *
 * @author makejava
 * @since 2024-08-17 00:44:51
 */

@Entity // 表示这是一个实体类
@Data
@NoArgsConstructor
@Table(name = "basket") // 指定对应的数据库表名
public class Basket implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略，使用数据库自增主键
    private Integer basketId;
    /**
     * 店铺ID
     */
    private Long shopId;
    /**
     * 产品ID
     */
    private Integer prodId;
    /**
     * SkuID
     */
    private Integer skuId;
    /**
     * 用户ID
     */
    private String openId;
    /**
     * 购物车产品个数
     */
    private Integer prodCount;
    /**
     * 购物时间
     */
    private Date createTime;

}

