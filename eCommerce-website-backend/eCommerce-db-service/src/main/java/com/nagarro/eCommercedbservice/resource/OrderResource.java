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

import com.nagarro.eCommercedbservice.model.Order;
import com.nagarro.eCommercedbservice.model.Product;
import com.nagarro.eCommercedbservice.repository.OrderRepository;
import com.nagarro.eCommercedbservice.repository.ProductRepository;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/db/order")
public class OrderResource {
	
	@Autowired
	OrderRepository repository;
	
	@GetMapping("/save/{customerName}/{productPrice}")
	public boolean save(@PathVariable("customerName") String customerName,
			@PathVariable("productPrice") String productPrice) {
		Order order = new Order();
		order.setCustomerUserName(customerName);
		order.setProductName(productPrice);
		repository.save(order);
		return true;
	}
	
	}
