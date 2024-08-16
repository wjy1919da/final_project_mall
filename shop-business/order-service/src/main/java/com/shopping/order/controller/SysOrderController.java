package com.shopping.order.controller;

import com.shopping.order.entity.Order;
import com.shopping.order.model.Result;
import com.shopping.order.service.OrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("order")
@RestController
@RequiredArgsConstructor
public class SysOrderController {

    private final OrderService orderService;


    @GetMapping("page")
    public Result<Page<Order>> loadOrderPage(int current, int size,
                                             @RequestParam(required = false) String orderNumber,
                                             @RequestParam(required = false) Integer status,
                                             @RequestParam(required = false) Date startTime,
                                             @RequestParam(required = false) Date endTime) {

        Pageable page = PageRequest.of(current, size);
        //order.set
        // 多条件分页查询订单
        Page<Order> pageList = orderService.queryOrderPage(page, orderNumber, status, startTime, endTime);
        return Result.success(pageList);
    }

}

