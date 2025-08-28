package com.atguigu.gulimall.ware;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.atguigu.gulimall.ware.service.WareInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class BasicFunctionTest {

    @Resource
    WareInfoService wareInfoService;

    @Test
    void queryTest() {
        // wareInfoService.list(new QueryWrapper<WareInfoEntity>().ge("id", 1L));
    }

}
