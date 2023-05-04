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

import com.example.demo.Entity.ProductInventory;

import com.example.demo.Service.ProductInventoryService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductInventoryController {
	
	@Autowired
	private ProductInventoryService service;

	@GetMapping("/getAllProductInvntory")
	public List<ProductInventory> getAllProductInv() {
		return service.getAllProductInv();
	}

	@GetMapping("/getProductInvById/{id}")
	public ProductInventory getProductInvById(@PathVariable("id") int productId) {
		boolean check = service.existById(productId);
		if (check) {
			 return service.getProductById(productId);
		}
		return null;
	}

	@PostMapping("/insertProductInventory")
	public String insertProductInv(@RequestBody ProductInventory product) {
		boolean status = service.existById(product.getProductId());
		if (status == false) {
			return service.insertProductInventory(product);
		}
		return "Duplicate Product ID";
	}

	@PutMapping("/updateProductInv/{product_id}")
	public String updateProductInv(@PathVariable("product_id") int product_id, @RequestBody ProductInventory prod) {
		boolean status = service.existById(product_id);
		if(status) {
		return service.updateProductInv(prod);
		}
		return "Id Not Exist !!";
	}

	@DeleteMapping("/deleteInventoryById/{productId}")
	public String deleteById(@PathVariable("productId") int productId) {
		boolean status = service.existById(productId);
		if (status == false) {
			return "Product ID NOT exist!!!";
		}
		service.deleteProductinv(productId);
		return "Product Deleted!!";
	}


}
