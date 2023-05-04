package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CustomerInformation;
import com.example.demo.Repository.CustomerInformationRepository;

@Service
public class CustomerInformationService {
	
	@Autowired
	private CustomerInformationRepository repository;
	
	public boolean existbyId(int Id) {
		return repository.existsById(Id);
	}
	
	public List<CustomerInformation> getAllCustomer(){
		return repository.findAll();
	}
	
	public String insertCustomerInfo(CustomerInformation customerInfo) {
		CustomerInformation c= repository.save(customerInfo);
		if(c !=null) {
			return "Record Inserted !!";
		}
		 return "Record NOT Inserted !!!";
	}
	
	public String updateCustomerInfo(CustomerInformation customer) {
		CustomerInformation c1 = repository.save(customer);
		if( c1!= null) {
			return "Record Updated Successfully";		
			}
		return "Record Not Updated !!!";
	}
	public void deleteCustomer(int Id) {
		 repository.deleteById(Id);
	}
	
	public CustomerInformation getCustomerById(int id) {
		return repository.getCustomerByCustomerId(id);
		
	}
	
	public CustomerInformation getCustomerByBillId(int id) {
		return repository.getCustomerByBillId(id);
		
	}
	public CustomerInformation getCustomerByName(String name) {
		return repository.getCustomerByfirstName(name);
	}
	

}
