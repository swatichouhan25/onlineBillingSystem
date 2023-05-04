package com.example.demo.Entity;

import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="productlist")
public class ProductList {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name="product_id")
	    private int productId;

	    @Column(length=20)
		private String productName;
	   
	    @Column(length=30)
	    private String productDescription;
	    
	    @Column(length=15)
		private double productPrice;
	    
	    @Column(length=15)
		private int productQuantity;
		
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "products")
	private Set<BillDetails> bill;
		
		public ProductList() {
			
		}
		
		
		
		public int getProductQuantity() {
			return productQuantity;
		}

		public void setProductQuantity(int productQuantity) {
			this.productQuantity = productQuantity;
		}

			public int getProductId() {
			return productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductDescription() {
			return productDescription;
		}

		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		
		
		
	
	

}
