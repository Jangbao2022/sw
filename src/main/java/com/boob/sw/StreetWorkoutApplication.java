package com.boob.sw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.boob.sw.mapper")
public class StreetWorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreetWorkoutApplication.class, args);
    }
}
