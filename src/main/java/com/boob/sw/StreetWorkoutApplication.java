package com.boob.sw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.boob.sw.mapper")
public class StreetWorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreetWorkoutApplication.class, args);
    }
}
