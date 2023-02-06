package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Employee;
import com.app.repo.EmplyeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	 @Autowired
	 private EmplyeeRepo empRepo;
	
	@Override
	public List<Employee> getEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee newEmp) {
		return empRepo.save(newEmp);
	}

	@Override
	public Employee updateEmployee(Employee newEmp) {
		if(empRepo.existsById(newEmp.getId())) {
		return empRepo.save(newEmp);
		}
		else {
		return null;
		}
	}

	@Override
	public String deleteEmployee(Long empId) {
		empRepo.deleteById(empId);
		return "Employee Deleted";
	}

}
