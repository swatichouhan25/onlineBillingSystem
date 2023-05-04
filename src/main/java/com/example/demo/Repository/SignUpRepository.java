package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.SignUp;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Integer> {
	
	public SignUp findByEmployeeId(int empId);
	
	
}
