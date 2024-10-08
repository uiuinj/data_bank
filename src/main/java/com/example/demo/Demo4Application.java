package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableWebMvc
public class Demo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}
}