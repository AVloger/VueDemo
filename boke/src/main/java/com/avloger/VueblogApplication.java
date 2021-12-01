package com.avloger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : avloger
 * @date : 2021/11/30 15:09
 */
@SpringBootApplication
@MapperScan(basePackages = "com.avloger.mapper")
public class VueblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueblogApplication.class, args);
    }

}
