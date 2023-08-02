package com.cts.EmployeeMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.EmployeeMVC.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}
