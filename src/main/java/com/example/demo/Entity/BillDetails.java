package com.example.demo.Entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import antlr.collections.List;

@Entity
public class BillDetails {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="bill_id")
	private int billId;
	
	@Column(length=15)
	private Date billDate;
	
	@Column(length=20)
	private String paymentMode;
	
	@Column(length=5)
	private float gst;
	
	@Column(length=5)
	private float discount;
	
	@Column(length=10)
	private double finalPrice;
	
	@Column(length=20)
	private String userName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="custid", referencedColumnName = "customer_id")
	@JsonBackReference
	private CustomerInformation customerInformation;

	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name ="multiple_product",joinColumns = {
			@JoinColumn(referencedColumnName = "bill_id",name="billid")
	},inverseJoinColumns = {
			@JoinColumn(referencedColumnName = "product_id",name="productid")})
	private Set<ProductList> products;
	
	public int getBillId() {
		return billId;
	}

	public Set<ProductList> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductList> products) {
		this.products = products;
	}

	
	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
//
//	public String getProductId() {
//		return productId;
//	}
//
//	public void setProductId(String productId) {
//		this.productId = productId;
//	}

	
	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public float getGst() {
		return gst;
	}

	public void setGst(float gst) {
		this.gst = gst;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CustomerInformation getCustomerInformation() {
		return customerInformation;
	}

	public void setCustomerInformation(CustomerInformation customerInformation) {
		this.customerInformation = customerInformation;
	}
	
	
	

}
