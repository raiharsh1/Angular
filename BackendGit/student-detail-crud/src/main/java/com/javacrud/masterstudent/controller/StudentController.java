package com.javacrud.masterstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javacrud.masterstudent.entity.Student;
import com.javacrud.masterstudent.service.StudentService;

@RestController
public class StudentController {
	 @Autowired
	 private StudentService studentService;

	 @PostMapping("/student")
	 public Student saveStudent(@RequestBody Student student) {
		 return studentService.saveStudent(student);
	 }
	 
}
