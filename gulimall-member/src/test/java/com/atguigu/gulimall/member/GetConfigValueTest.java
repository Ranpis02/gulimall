package com.atguigu.gulimall.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GetConfigValueTest {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @Test
    public void printConfigMessage() {
        System.out.println("port: " + port);
        System.out.println("application name: " + name);
    }

}
