package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ProductList;
import com.example.demo.Service.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/getAllProduct")
	public List<ProductList> getAllProduct() {
		return service.getAllProduct();
	}

	@GetMapping("/getProductById/{id}")
	public ProductList getProductById(@PathVariable("id") int productId) {
		boolean check = service.existById(productId);
		if (check) {
			 return service.getProductById(productId);
		}
		return null;
	}

	@PostMapping("/insertProduct")
	public String insertProduct(@RequestBody ProductList product) {
		boolean status = service.existById(product.getProductId());
		if (status == false) {
			return service.insertProduct(product);
		}
		return "Duplicate Product ID";
	}

	@PutMapping("/updateProduct/{product_id}")
	public String updateProduct(@PathVariable("product_id") int product_id, @RequestBody ProductList prod) {
		boolean status = service.existById(product_id);
		if(status) {
		return service.updateProduct(prod);
		}
		return "Id Not Exist !!";
	}

	@DeleteMapping("/deleteById/{productId}")
	public String deleteById(@PathVariable("productId") int productId) {
		boolean status = service.existById(productId);
		if (status == false) {
			return "Product ID NOT exist!!!";
		}
		service.deleteProduct(productId);
		return "Product Deleted!!";
	}
	
//	@GetMapping("/getProductByCategoryName/{name}")
//	public ProductList getProductByCategoryName(@PathVariable("name") String cateName) {
//		 return service.getProductByCategoryName(cateName);
//	}

}
