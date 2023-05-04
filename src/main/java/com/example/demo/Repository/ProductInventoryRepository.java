package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ProductInventory;
import com.example.demo.Entity.ProductList;

@Repository
public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Integer> {

	public ProductInventory getProductInByProductId(int productId);
}
