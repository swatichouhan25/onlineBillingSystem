package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class SignUp {
	
	private String firstName;
	private String lastName;
	private String gender;
	private Date date_Of_Birth;
	 private String storeId;
	 private Date date_of_Joining;
	 private String userName;
	 private String password;
	 private String emailId;
	 private String userRole;
	 private String address;
	 private String phoneNumber;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int  employeeId;
	
	 
	public SignUp() {
		
	}


	public SignUp(String firstName, String lastName, String gender, Date date_Of_Birth, String storeId,
			Date date_of_Joining, String userName, String password, String emailId, String userRole, String address,
			String phoneNumber, int employeeId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.date_Of_Birth = date_Of_Birth;
		this.storeId = storeId;
		this.date_of_Joining = date_of_Joining;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.userRole = userRole;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.employeeId = employeeId;
	}

	


	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	



	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}


	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}


	public String getStoreId() {
		return storeId;
	}


	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}


	public Date getDate_of_Joining() {
		return date_of_Joining;
	}


	public void setDate_of_Joining(Date date_of_Joining) {
		this.date_of_Joining = date_of_Joining;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	

	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	 
	
	
	 
	 
	 
	

}
