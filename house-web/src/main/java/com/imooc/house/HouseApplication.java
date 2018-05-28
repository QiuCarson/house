package com.imooc.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(value = "com.imooc.house.biz")
//@MapperScan(value = "com.imooc.house.biz.mapper")
public class HouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);
    }
}
