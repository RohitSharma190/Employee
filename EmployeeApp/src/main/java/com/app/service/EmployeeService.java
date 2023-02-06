package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pojo.Employee;


public interface EmployeeService {
	
	List<Employee> getEmployee();
	
	Employee addEmployee(Employee newEmp);
	
	Employee updateEmployee(Employee newEmp);
	
	String deleteEmployee(Long empId);
	
	
	

}
