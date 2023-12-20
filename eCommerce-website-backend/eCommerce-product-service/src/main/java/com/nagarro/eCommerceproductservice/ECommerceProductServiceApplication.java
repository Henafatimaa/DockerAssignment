package com.nagarro.eCommerceproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.nagarro.eCommerceproductservice")
@SpringBootApplication
public class ECommerceProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceProductServiceApplication.class, args);
	}

}
