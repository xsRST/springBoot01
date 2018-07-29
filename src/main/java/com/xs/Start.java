package com.xs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动
 * @author 75612
 */
@SpringBootApplication
@ImportResource({"classpath:mybatis.xml"})
public class Start   {
    public static void main(String[] args) {
        SpringApplication.run(Start.class);
    }
}
