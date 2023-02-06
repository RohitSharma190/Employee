package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	   @GetMapping
     public List<Employee> getEmployee(){
		   return empService.getEmployee();
    	 
     }
	
	   @PostMapping
     public Employee addEmployee(@RequestBody Employee newEmp) {
    	 
		   return empService.addEmployee(newEmp);
     }
	 
	   @PutMapping
	   public Employee updateEmployee(@RequestBody Employee newEmp) {
		   return empService.updateEmployee(newEmp);
    	 
     }
	
	   @DeleteMapping("/{empId}")
     public String deleteEmployee(@PathVariable Long empId) {
            return empService.deleteEmployee(empId);	 
     }

}
