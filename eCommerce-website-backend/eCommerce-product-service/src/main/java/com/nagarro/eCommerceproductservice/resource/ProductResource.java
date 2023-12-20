package com.nagarro.eCommerceproductservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productservice")
public class ProductResource {
	
	@Autowired
	private RestTemplate template;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getProductByName/{productName}")
	public List<String> getProductByName(@PathVariable("productName")String productName){
		return template.getForObject("http://localhost:9301/db/product/"+productName, List.class);
	}
	

}
