package com.shopping.order.service;

import com.shopping.order.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单表(Order)表服务接口
 *
 * @author makejava
 * @since 2024-08-14 20:22:19
 */
@Service
public interface OrderService {

    public Page<Order> queryOrderPage(Pageable page, String orderNumber, Integer status,Date startTime, Date endTime);
}
