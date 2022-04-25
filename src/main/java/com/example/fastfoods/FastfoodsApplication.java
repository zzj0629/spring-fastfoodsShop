package com.example.fastfoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.example.fastfoods.dao")//主要作用是扫包
public class FastfoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastfoodsApplication.class, args);
    }

}
