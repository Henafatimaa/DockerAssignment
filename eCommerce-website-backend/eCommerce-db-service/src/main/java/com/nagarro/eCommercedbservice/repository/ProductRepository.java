package com.nagarro.eCommercedbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.eCommercedbservice.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	List<Product> findByName(String productName);

}
