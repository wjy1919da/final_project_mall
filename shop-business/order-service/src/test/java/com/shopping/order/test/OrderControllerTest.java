package com.shopping.order.test;

import com.alibaba.fastjson.JSON;
import com.fhs.jpa.wrapper.LambdaQueryWrapper;
import com.shopping.order.dao.OrderDao;
import com.shopping.order.dao.OrderItemDao;
import com.shopping.order.entity.Order;
import com.shopping.order.entity.OrderItem;
import com.shopping.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerTest {

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String BASEURI;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderItemDao orderItemDao;

    @Test
    public void testFindAll_Paging() {

        Pageable pageable = PageRequest.of(0, 4);
        String orderNumber = null;
        Integer status =6 ;
        Date start=null,end=null;
        System.out.printf("根据订单编号查询所有订单商品条目对象集合 : ");
        Page<Order> pageList = orderService.queryOrderPage(pageable, orderNumber, status,start,end);

        List<Order> orderList = pageList.getContent();

        System.out.printf("根据订单编号查询所有订单商品条目对象集合 : "+ JSON.toJSONString(orderList));
    }

    @Test
    public void testDate(){

        orderItemDao.findAll();

    }
}
