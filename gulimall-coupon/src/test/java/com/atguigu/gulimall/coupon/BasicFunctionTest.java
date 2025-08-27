package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entity.SkuLadderEntity;
import com.atguigu.gulimall.coupon.service.SkuLadderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class BasicFunctionTest {
    @Resource
    SkuLadderService skuLadderService;

    @Test
    void queryTest() {
        skuLadderService.list(new QueryWrapper<SkuLadderEntity>().ge("id", 1L));
    }
}
