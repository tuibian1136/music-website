package com.example.yin;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.yin.mapper")
@Slf4j
public class YinMusicApplication {

    public static void main(String[] args) {
        log.error("user.dir的值:{}", System.getProperty("user.dir"));
        SpringApplication.run(YinMusicApplication.class, args);
    }

}

