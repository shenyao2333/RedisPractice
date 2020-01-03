package com.sy.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.sy.practice.utils","com.sy.practice.controller","com.sy.practice.config","com.sy.practice.mapper"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

}
