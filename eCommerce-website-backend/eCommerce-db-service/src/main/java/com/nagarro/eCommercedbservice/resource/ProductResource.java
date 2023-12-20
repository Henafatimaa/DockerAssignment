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

import com.nagarro.eCommercedbservice.model.Product;
import com.nagarro.eCommercedbservice.repository.ProductRepository;

@RestController
@RequestMapping("/db/product")
public class ProductResource {
	
	@Autowired
	ProductRepository repository;
	
	@PostMapping("/save")
	public void save(@RequestBody Product product) {
		
		repository.save(product);
	}
	
	@GetMapping("{productName}")
	public List<String> getProductPrice(@PathVariable("productName")String productName) {
		
		List<Product> productList = repository.findByName(productName);
		List<String> prices = new ArrayList<String>();
		for(Product product:productList) {
			prices.add(product.getPrice());
			
		}
		return prices;
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getProduct() {
		
		return repository.findAll();
	}
	

}
