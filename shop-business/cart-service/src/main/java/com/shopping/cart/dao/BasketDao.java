package com.shopping.cart.dao;

import com.shopping.cart.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 购物车(Basket)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-17 00:44:48
 */
@Repository
public interface BasketDao extends JpaRepository<Basket, Long>, JpaSpecificationExecutor<Basket> {

    @Modifying
    @Query("update Basket y set y.prod_count = :newValue where y.id = :id")
    @Transactional
    int updateById(Integer id, Integer newValue);
}

