package com.nagarro.eCommercecustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan("com.nagarro.eCommercecustomerservice")
@SpringBootApplication
public class ECommerceCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceCustomerServiceApplication.class, args);
	}

}
