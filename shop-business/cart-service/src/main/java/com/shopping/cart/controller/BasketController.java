package com.shopping.cart.controller;

import com.shopping.cart.entity.Basket;
import com.shopping.cart.service.BasketService;
import com.shopping.common.model.Result;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static com.shopping.common.model.Result.*;

/**
 * 购物车(Basket)表控制层
 *
 * @author makejava
 * @since 2024-08-17 00:44:45
 */
@RequestMapping("api/shopCart")
@RestController
public class BasketController {
    /**
     * 服务对象
     */
    @Resource
    private BasketService basketService;


    //@ApiOperation("添加商品到购物车或修改商品在购物车中的数量")
    @PostMapping("changeItem")
    public Result<String> changeCartItem(@RequestBody Basket basket) {

        Boolean changed = basketService.changeCartItem(basket,basket.getOpenId());

        Boolean changed1 = true ;
        return Result.handle(changed1);

    }

}

