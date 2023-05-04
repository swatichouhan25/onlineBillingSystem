package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.BillDetails;

@Repository
public interface BillRepository extends JpaRepository<BillDetails, String> {
 public BillDetails findByBillId(String id);
}
