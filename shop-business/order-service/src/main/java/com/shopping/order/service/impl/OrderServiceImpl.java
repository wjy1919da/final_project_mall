package com.shopping.order.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.fhs.jpa.wrapper.LambdaQueryWrapper;
import com.shopping.order.dao.OrderDao;
import com.shopping.order.dao.OrderItemDao;
import com.shopping.order.entity.Order;
import com.shopping.order.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.shopping.order.service.OrderService;
import org.springframework.util.StringUtils;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 订单表(Order)表服务实现类
 *
 * @author makejava
 * @since 2024-08-14 20:22:22
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao ;

    @Autowired
    OrderItemDao orderItemDao ;

    public Page<Order> queryOrderPage(Pageable page, String orderNumber, Integer status, Date startTime, Date endTime){



        //Pageable pageable = PageRequest.of(page, size);


        Page<Order> pageList =  orderDao.findAll(new LambdaQueryWrapper<Order>()
                .eq(ObjectUtil.isNotNull(status), Order::getStatus, status)
                .between(ObjectUtil.isAllNotEmpty(startTime, endTime), Order::getCreateTime, startTime, endTime)
                .eq(StringUtils.hasText(orderNumber), Order::getOrderNumber, orderNumber)
                .orderByAsc(Order::getUpdateTime)
                .build(),page);

        List<Order> orderList = pageList.getContent();

        // 判断是否有值
        if (ObjectUtil.isNotEmpty(orderList)) {
            return pageList;
        }

        // 从订单记录集合中获取订单编号集合
        List<String> orderNumberList = orderList.stream().map(Order::getOrderNumber).collect(Collectors.toList());

        // 根据订单编号查询所有订单商品条目对象集合
        List<OrderItem> orderItemList = orderItemDao.findAll(
                new LambdaQueryWrapper<OrderItem>()
                        .in(OrderItem::getOrderNumber, orderNumberList)
                        .build()
        );

        //System.out.printf("根据订单编号查询所有订单商品条目对象集合 : "+ JSON.toJSONString(orderItemList));

        orderList.forEach(order -> {
            // 从订单商品条目对象集合中过滤出与当前订单记录的编号一致的商品条目对象集合
            List<OrderItem> itemList = orderItemList.stream()
                    .filter(orderItem -> orderItem.getOrderNumber().equals(order.getOrderNumber()))
                    .collect(Collectors.toList());

            order.setOrderItems(itemList);
        });

        //System.out.printf("根据订单编号查询所有订单商品条目对象集合 : "+ JSON.toJSONString(orderList));

        return pageList ;

    }
}
