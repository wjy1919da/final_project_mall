package com.shopping.order.dao;

import com.shopping.order.entity.Order;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单表(Order)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-14 20:22:09
 */
@Repository
public interface OrderDao extends JpaRepository<Order, Long> , JpaSpecificationExecutor<Order> {

}

