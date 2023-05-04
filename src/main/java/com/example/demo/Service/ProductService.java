package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ProductList;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public boolean existById(int productId) {
		return repository.existsById(productId);
	}
	
	public ProductList getProductById(int Id) {
		return repository.getProductByProductId(Id);
		
	}
	
	public List<ProductList> getAllProduct(){
		return repository.findAll();
	}
	
	public String insertProduct(ProductList product) {
	
		ProductList prod = repository.save(product);
		if(prod != null) {
			return "New Product Inserted Successfully! ";
			}
		 return "Product Not Inserted!!!!";
		
	}
	
	public String updateProduct(ProductList prod) {
		ProductList p1= repository.save(prod);
		if(p1 !=null) {
			return "Product List updated Sccessfully";
		}
		return "Product List NOT updated Sccessfully";
	}
	
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}
//	public ProductList getProductByCategoryName(String cateName) {
//		return repository.findProductByCategoryName(cateName);
//	}
	
	
	
	
	
	
	
	

}
