package com.etoak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//springboot启动类
@EnableAutoConfiguration //启动springboot自动配置
@ComponentScan(basePackages = "com.etoak") //扫描com.etoak包机器子包下的注解
public class HelloApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);

	}

}
