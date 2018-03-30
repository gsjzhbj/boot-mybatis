package com.jxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxm.mapper")
public class MbatisbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MbatisbootApplication.class, args);
	}
}
