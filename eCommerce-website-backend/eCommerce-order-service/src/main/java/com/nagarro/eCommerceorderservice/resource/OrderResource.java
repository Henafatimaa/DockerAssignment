package com.nagarro.eCommerceorderservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orderservice")
public class OrderResource {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/{customerUserName}/{productName}")
	public void placeOrder(@PathVariable("customerUserName") String customerUserName
			,@PathVariable("productName") String productName) {
		
		@SuppressWarnings("unchecked")
		List<String> customerData = template.getForObject("http://localhost:9303/customerservice/getCustomer/"+customerUserName, List.class);
		List<String> productPrice= template.getForObject("http://localhost:9302/productservice/"+productName, List.class);
		
		template.getForObject("http://localhost:9301/db/order/save/"+ customerData.get(0)+"/"+productPrice.get(0),Boolean.class);
		
	}
	
	

}
