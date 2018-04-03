package com.jxm;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxm.mapper")
@EnableAdminServer
public class MbatisbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MbatisbootApplication.class, args);
	}
}
