package com.atguigu.gulimall.member;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.member.feign.CouponClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FeignClientTest {

    @Autowired
    CouponClient couponClient;

    @Test
    void getCouponListByFeign() {
        R r = couponClient.getMemberCouponsListDemo();
        Object coupons = r.get("coupons");
        System.out.println(coupons);

    }
}
