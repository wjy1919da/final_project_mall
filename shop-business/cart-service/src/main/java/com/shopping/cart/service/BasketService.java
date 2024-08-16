package com.shopping.cart.service;

import com.shopping.cart.entity.Basket;
import com.shopping.cart.vo.CartTotalAmount;
import com.shopping.cart.vo.CartVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 购物车(Basket)表服务接口
 *
 * @author makejava
 * @since 2024-08-17 00:44:54
 */
@Service
public interface BasketService {

    Boolean changeCartItem(Basket basket,String openId);

}
