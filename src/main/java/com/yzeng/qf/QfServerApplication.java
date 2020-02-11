package com.yzeng.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzeng.qf.dao")
public class QfServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QfServerApplication.class, args);
	}

}
