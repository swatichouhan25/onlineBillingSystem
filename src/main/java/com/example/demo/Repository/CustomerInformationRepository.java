package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.CustomerInformation;

@Repository
public interface CustomerInformationRepository extends JpaRepository<CustomerInformation, Integer> {

	 public CustomerInformation getCustomerByCustomerId(int id);
	 
	 
	 @Query("select c from CustomerInformation c where  c.billDetails.billId=:id")
	 public CustomerInformation getCustomerByBillId(int id);
	 
	 public CustomerInformation getCustomerByfirstName(String name);
	 

}
