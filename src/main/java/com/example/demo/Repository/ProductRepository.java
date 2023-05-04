package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ProductList;

@Repository
public interface ProductRepository extends JpaRepository<ProductList, Integer> {
	
	public ProductList getProductByProductId(int productId);
	
	//public ProductList findProductByCategoryName(String cateName);
	

}
