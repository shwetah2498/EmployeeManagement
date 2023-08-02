package com.cts.EmployeeMVC.service;

import java.util.List;

import com.cts.EmployeeMVC.entity.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
