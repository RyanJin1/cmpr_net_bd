package com.jyc.cmpr_net_bd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jyc.cmpr_net_bd.mapper")
public class CmprNetBdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmprNetBdApplication.class, args);
    }

}
