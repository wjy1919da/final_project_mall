package com.shopping.order.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * 订单表(Order)实体类
 *
 * @author makejava
 * @since 2024-08-14 20:22:15
 */
@Entity // 表示这是一个实体类
@Data
@NoArgsConstructor
@Table(name = "order_") // 指定对应的数据库表名
public class Order {

    /**
     * 订单ID
     */
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略，使用数据库自增主键
    private Integer orderId;
    /**
     * 订购用户ID
     */
    private String openId;
    /**
     * 订购流水号
     */
    private String orderNumber;
    /**
     * 总值
     */
    private Double totalMoney;
    /**
     * 实际总值
     */
    private Double actualTotal;
    /**
     * 订单备注
     */
    private String remarks;
    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:成功 6:失败
     */
    private Integer status;
    /**
     * 配送类型
     */
    private String dvyType;
    /**
     * 配送方式ID
     */
    private Long dvyId;
    /**
     * 物流单号
     */
    private String dvyFlowId;
    /**
     * 订单运费
     */
    private Double freightAmount;
    /**
     * 用户订单地址Id
     */
    private Long addrOrderId;
    /**
     * 订单商品总数
     */
    private Integer productNums;
    /**
     * 订购时间
     */
    private Date createTime;
    /**
     * 订单更新时间
     */
    private Date updateTime;
    /**
     * 付款时间
     */
    private Date payTime;
    /**
     * 发货时间
     */
    private Date dvyTime;
    /**
     * 完成时间
     */
    private Date finallyTime;
    /**
     * 取消时间
     */
    private Date cancelTime;
    /**
     * 是否已经支付，1：已经支付过，0：，没有支付过
     */
    private Integer isPayed;
    /**
     * 用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除
     */
    private Integer deleteStatus;
    /**
     * 0:默认,1:在处理,2:处理完成
     */
    private Integer refundSts;
    /**
     * 优惠总额
     */
    private Double reduceAmount;
    /**
     * 订单关闭原因 1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    private Integer closeType;

    @Transient
    private List<OrderItem> orderItems;

}

