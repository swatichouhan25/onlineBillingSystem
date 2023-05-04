package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.SignUp;
import com.example.demo.Repository.SignUpRepository;

@Service
public class SignUpService {
	
	@Autowired
	private SignUpRepository repository;
	
	public boolean existsById(int employeeId) {
		return repository.existsById(employeeId);		
	}
	
	public String insertSignUp(SignUp sign) {
	   SignUp s= repository.save(sign);
	   if(s !=null) {
		 
		   return "Record Inserted Successfully";
		   
	   }
	   return "Record NOT Inserted !!!!!";
	}
	
	
	public String updateSignUp(SignUp sign) {
		 SignUp s= repository.save(sign);
		   if(s !=null) {
			   return "Record Updated Successfully";
			   
		   }
		   return "Record NOT Updated  !!!!!";
		}
	
	
	public void deleteSignUpById(int ID) {
		 repository.deleteById(ID);
	}
	
	public SignUp getEmpById(int Id) {
		return repository.findByEmployeeId(Id);
		
		}
	
	public List<SignUp> getAllStoreEmployee(){
		return repository.findAll();
	}
	
	public SignUp getStoreEmpById(int id) {
		return repository.findByEmployeeId(id);
	}
	}
	



