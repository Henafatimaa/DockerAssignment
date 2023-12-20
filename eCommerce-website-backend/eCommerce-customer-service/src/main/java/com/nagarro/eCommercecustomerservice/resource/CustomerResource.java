package com.nagarro.eCommercecustomerservice.resource;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/customerservice")
public class CustomerResource {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/getCustomer/{customerUserName}")
	public List getCustomer(@PathVariable("customerUserName") String customerUserName) {
		
		return template.getForObject("http://localhost:9301/db/customer/johnuser"+customerUserName, List.class);
	}
	

}
