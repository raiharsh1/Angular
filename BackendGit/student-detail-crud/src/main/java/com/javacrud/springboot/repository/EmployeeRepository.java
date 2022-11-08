package com.javacrud.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacrud.springboot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

}
