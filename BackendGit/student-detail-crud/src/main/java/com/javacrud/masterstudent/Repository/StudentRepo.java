package com.javacrud.masterstudent.Repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacrud.masterstudent.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
