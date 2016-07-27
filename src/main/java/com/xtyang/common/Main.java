package com.xtyang.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by yangxiaoting on 2016/07/27.
 */

@SpringBootApplication
@MapperScan("com.xtyang.common.mapper")
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
