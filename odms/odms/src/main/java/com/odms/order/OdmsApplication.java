package com.odms.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.odms")
@EnableFeignClients
public class OdmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdmsApplication.class, args);
	}

}
