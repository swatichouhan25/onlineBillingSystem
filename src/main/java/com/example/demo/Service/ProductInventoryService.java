package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ProductInventory;
import com.example.demo.Entity.ProductList;
import com.example.demo.Repository.ProductInventoryRepository;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductInventoryService {
	
	
	@Autowired
	private ProductInventoryRepository repository;
	
	public boolean existById(int productId) {
		return repository.existsById(productId);
	}
	
	public ProductInventory getProductById(int Id) {
		return repository.getProductInByProductId(Id);
		
	}
	
	public List<ProductInventory> getAllProductInv(){
		return repository.findAll();
	}
	
	public String insertProductInventory(ProductInventory product) {
	
		ProductInventory prod = repository.save(product);
		if(prod != null) {
			return "New Product Inserted Successfully! ";
			}
		 return "Product Not Inserted!!!!";
		
	}
	
	public String updateProductInv(ProductInventory prod) {
		ProductInventory p1= repository.save(prod);
		if(p1 !=null) {
			return "Product List updated Sccessfully";
		}
		return "Product List NOT updated Sccessfully";
	}
	
	public void deleteProductinv(int id) {
		repository.deleteById(id);
	}

}
