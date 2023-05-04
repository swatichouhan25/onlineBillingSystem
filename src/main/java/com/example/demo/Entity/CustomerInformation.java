package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class CustomerInformation {
	@Id
	@Column(name= "customer_id" ,length=20)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	
	@Column(length=20)
	private String firstName;
	
	@Column(name="date_of_birth",length=20)
	private Date dob;
	
	@Column(length=20)
	private long phoneNumber;
	
	@Column(length=25)
	private String email;
	
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "customerInformation")
	@JsonManagedReference
	private BillDetails billDetails;

	public int getCustomerId() {
		return customerId;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BillDetails getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(BillDetails billDetails) {
		this.billDetails = billDetails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

	
}
