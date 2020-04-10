package com.wxy.buyplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wxy.buyplus.dao"})
public class BuyplusApplication {
	public static void main(String[] args) {
		SpringApplication.run(BuyplusApplication.class, args);
	}

}
