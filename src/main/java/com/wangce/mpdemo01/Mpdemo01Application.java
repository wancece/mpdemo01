package com.wangce.mpdemo01;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mpdemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mpdemo01Application.class, args);
    }

}
