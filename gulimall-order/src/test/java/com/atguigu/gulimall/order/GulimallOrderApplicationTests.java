package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.atguigu.gulimall.order.service.OrderItemService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallOrderApplicationTests {
    @Resource
    OrderItemService orderItemService;

    @Test
    void contextLoads() {
    }

    @Test
    void testOnQuery() {
        // OrderItemEntity orderItemEntity = new OrderItemEntity();
        // orderItemService.list(new QueryWrapper<OrderItemEntity>().ge("id", 1L))
        //         .forEach(System.out::println);
    }

}
