package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entity.SkuLadderEntity;
import com.atguigu.gulimall.coupon.service.SkuLadderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class BasicFunctionTest {
    @Autowired
    SkuLadderService skuLadderService;

    @Test
    void insertTest() {
        SkuLadderEntity skuLadderEntity = new SkuLadderEntity();
        skuLadderEntity.setSkuId(1L);
        skuLadderEntity.setFullCount(100);
        skuLadderEntity.setDiscount(new BigDecimal("0.75"));
        skuLadderService.save(skuLadderEntity);
    }
}
