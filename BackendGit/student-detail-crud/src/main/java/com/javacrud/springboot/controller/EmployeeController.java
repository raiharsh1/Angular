package com.javacrud.springboot.controller;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.javacrud.springboot.entity.Employee;
import com.javacrud.springboot.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	
	// Get All Employee
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return employeeservice.findAll();
	}
	
	// Get By Id
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> findEmployeeByid(@PathVariable int id){
		return employeeservice.findEmployeeById(id);
		
	}
	// Post 
	@PostMapping("/employees")
	 public Employee saveEmployee( @RequestBody Employee employee) {
  	  return employeeservice.saveEmployee(employee);
    }
	
	// Delete
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee (@PathVariable int id) {
		return employeeservice.deleteEmployee (id);
		
	}

	// Update
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(value="id")Integer id, @RequestBody Employee employee) {
	return employeeservice.updateEmployee(employee,id);
	
}
}
