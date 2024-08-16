package com.shopping.cart.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.fhs.jpa.wrapper.LambdaQueryWrapper;
import com.shopping.cart.entity.Basket;
import com.shopping.cart.dao.BasketDao;

import com.shopping.cart.service.BasketService;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;

import java.util.Date;

import java.util.Optional;


/**
 * 购物车(Basket)表服务实现类
 *
 * @author makejava
 * @since 2024-08-17 00:44:57
 */
@Service("basketService")
public class BasketServiceImpl implements BasketService {

    @Resource
    private BasketDao basketDao;

    @Override
    public Boolean changeCartItem(Basket basket,String openId) {
        // 获取会员openid
        //String openId = AuthUtils.getMemberOpenId();
        // 根据会员openId和商品skuId查询购物车记录
        Optional<Basket> op = basketDao.findOne(new LambdaQueryWrapper<Basket>()
                .eq(Basket::getOpenId, openId)
                .eq(Basket::getSkuId, basket.getSkuId())
                .build()
        );
        // 判断购物车记录是否有值
        Basket beforeBasket = op.orElse(null);
        if (ObjectUtil.isNotNull(beforeBasket)) {
            // 购物车记录不为空 -> 当前会员添加到购物车中的商品是存在的 -> 修改存在购物车中商品的数量
            // 计算商品最终数量
            int finalCount = beforeBasket.getProdCount() + basket.getProdCount();
            beforeBasket.setProdCount(finalCount);
            return basketDao.updateById(beforeBasket.getBasketId(),finalCount)>0;

        // 购物车记录为空 -> 当前会员添加到购物车中的商品是不存在的 -> 添加商品到购物车记录
        basket.setCreateTime(new Date());
        basket.setOpenId(openId);
        Basket save1 = basketDao.save(basket);
        return ObjectUtil.isNotNull(save1);
    }
}
