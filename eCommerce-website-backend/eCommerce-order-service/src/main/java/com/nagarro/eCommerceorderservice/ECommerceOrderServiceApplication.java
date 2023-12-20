package com.nagarro.eCommerceorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.nagarro.eCommerceorderservice")
@SpringBootApplication
public class ECommerceOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceOrderServiceApplication.class, args);
	}

}
