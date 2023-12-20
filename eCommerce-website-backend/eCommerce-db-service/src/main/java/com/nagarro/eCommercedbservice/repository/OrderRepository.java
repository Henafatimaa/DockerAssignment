package com.nagarro.eCommercedbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.eCommercedbservice.model.Customer;
import com.nagarro.eCommercedbservice.model.Order;
import com.nagarro.eCommercedbservice.model.Product;

public interface OrderRepository extends JpaRepository<Order,Integer>{

	

}
