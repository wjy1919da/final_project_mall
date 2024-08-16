package com.shopping.order.dao;


import com.shopping.order.entity.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单项(OrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-15 21:02:43
 */
@Repository
public interface OrderItemDao extends JpaRepository<OrderItem, Long>, JpaSpecificationExecutor<OrderItem> {

}

