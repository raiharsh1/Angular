package com.javacrud.masterstudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacrud.masterstudent.Repository.StudentRepo;
import com.javacrud.masterstudent.entity.Student;

@Service
public class StudentService {
 
	@Autowired
	private  StudentRepo studentRepo;

	public   Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
}
