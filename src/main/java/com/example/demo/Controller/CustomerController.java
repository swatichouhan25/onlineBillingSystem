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

import com.example.demo.Entity.CustomerInformation;
import com.example.demo.Service.CustomerInformationService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController 
public class CustomerController {
	
	@Autowired
	private CustomerInformationService service;
	
	@GetMapping("/getAllCustomer")
	public List<CustomerInformation> getAllCustomer(){
		return service.getAllCustomer();
	}
	
	@GetMapping("/getCustomerById/{id}")
	public CustomerInformation getCustomerById( @PathVariable("id") int id) {
		boolean status= service.existbyId(id);
		if(status) {
			return service.getCustomerById(id);
		
			}
		return null;
	}
	
	@GetMapping("/getCustomerByBillId/{id}")
	public CustomerInformation getCustomerByBillId(@PathVariable("id") int billId) {
		  return  service.getCustomerByBillId(billId);
	}
	
	@PostMapping("/insertCustomer")
	public String insertCustomer(@RequestBody CustomerInformation customer) {
	
		return service.insertCustomerInfo(customer);
	}
	
	@PutMapping("/updateCustomer/{id}")
	public String updateCustomer (@PathVariable("id")  String id, @RequestBody CustomerInformation customer) {
		boolean status = service.existbyId(customer.getCustomerId());
		if(status) {
			return service.updateCustomerInfo(customer).toString();
		}
	
		return " Customer ID NOT Exist !!!";
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		boolean status = service.existbyId(id);
		if(status) {
			 service.deleteCustomer(id);
			 return "Record Deleted Successfully !!";
			}
		return " Customer ID NOT Exist !!!";
	}

	
	@GetMapping("/getCustomerByName/{name}")
	public CustomerInformation getCustomeryName(@PathVariable("name") String name) {
		return service.getCustomerByName(name);
	}
		
	}
	
	
	


