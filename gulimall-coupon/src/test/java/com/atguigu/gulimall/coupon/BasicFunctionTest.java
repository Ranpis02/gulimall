package com.atguigu.gulimall.coupon;

import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.coupon.entity.SkuLadderEntity;
import com.atguigu.gulimall.coupon.service.SkuLadderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Wrapper;

@SpringBootTest
public class BasicFunctionTest {
    @Resource
    SkuLadderService skuLadderService;

    @Test
    void queryTest() {
        skuLadderService.list(new QueryWrapper<SkuLadderEntity>().ge("id", 1L));
    }
}
