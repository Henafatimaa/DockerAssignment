package com.nagarro.eCommercedbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.nagarro.eCommercedbservice.repository")
@ComponentScan(basePackages="com.nagarro.eCommercedbservice")
@SpringBootApplication
public class ECommerceDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceDbServiceApplication.class, args);
	}

}
