package com.javacrud.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.javacrud.springboot.entity.Employee;
import com.javacrud.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	//Get 
	
	public List<Employee> findAll() {
	
		return employeeRepository.findAll();
	}


	public Optional<Employee> findEmployeeById(int id) {
	
		return employeeRepository.findById(id);
	}
     
	 //Post
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
}

	//Delete

	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return id+"";
	}
	
	// Update
	
	public Employee updateEmployee(Employee employee, Integer id) {
		Optional<Employee> existingEmployee=employeeRepository.findById(id);
						if(existingEmployee.isPresent()) {
							Employee existingEmployee1=employeeRepository.findById(id).get();
						
		                   existingEmployee1.setFirstName(employee.getFirstName());
		                   existingEmployee1.setLastName(employee.getLastName());
		                   existingEmployee1.setEmail(employee.getEmail());
		                   existingEmployee1.setPhoneNo(employee.getPhoneNo());
		                   return employeeRepository.save(existingEmployee1);	
						}else {
							return null;
						}
		
		
	}
}