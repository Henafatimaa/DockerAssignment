package com.nagarro.eCommercedbservice.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.eCommercedbservice.model.Customer;
import com.nagarro.eCommercedbservice.model.Product;
import com.nagarro.eCommercedbservice.repository.CustomerRepository;
import com.nagarro.eCommercedbservice.repository.ProductRepository;

@RestController
@RequestMapping("/db/customer")
public class CustomerResource {
	
	@Autowired
	CustomerRepository repository;
	
	@PostMapping("/save")
	public void save(@RequestBody Customer customer) {
		
		repository.save(customer);
	}
	
	@GetMapping("{UserName}")
	public List<String> getCustomerByUserName(@PathVariable("userName")String userName) {
		
		List<Customer> customerList = repository.findByUserName(userName);
		List<String> customerName = new ArrayList<String>();
		for(Customer customer:customerList) {
			customerName.add(customer.getName());
			
		}
		return customerName;
	}
	
	
	

}
