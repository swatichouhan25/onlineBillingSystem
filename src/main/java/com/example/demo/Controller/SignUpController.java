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

import com.example.demo.Entity.SignUp;
import com.example.demo.Service.SignUpService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SignUpController {
	
	@Autowired
	private SignUpService service;
	
	@PostMapping("/insertSignUp")
	public String insertSignUp(@RequestBody SignUp sign) {
		boolean status = service.existsById(sign.getEmployeeId());
		if(status) {
			return "Duplicate ID";
		}
	
		return  service.insertSignUp(sign);
		
	}
	
	@PutMapping("/updateSignUp/{employeeId}")
	public String updateSignUp(@PathVariable("employeeId") String employeeId, @RequestBody  SignUp sign) {
		boolean status =service.existsById(sign.getEmployeeId());
		if(status) {
		 return service.updateSignUp(sign);
		}
		return "Record NOT Updated Successfully";
	}
	
	
	@DeleteMapping("/deleteSignUpById/{id}")
	public String deleteSignUpById(@PathVariable("id") int id) {
		boolean status = service.existsById(id);
		if(status) {
			service.deleteSignUpById(id);
			return "Employee Deleted Successfully !!!";
		}
		return "Employee NOT Deleted !!!!";
	}
	
	@GetMapping("/getEmpById/{empId}")
	public String  getEmpByID(@PathVariable("empId") int id) {
		boolean status= service.existsById(id);
		if(status) {
			service.getEmpById(id);
		}
		return "Employee ID NOT Exist !!!";
	}
	
	@GetMapping("/getAllStoreEmp")
	public List<SignUp> getAllEmployee(){
		return service.getAllStoreEmployee();
	}
	}


