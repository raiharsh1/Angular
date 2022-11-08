package com.javacrud.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
    
    @NotBlank
    @Size(min = 3, max = 15, message = "Username must be between 3 and 12 characters long")
    @Column(name="first_name")
	private String firstName;
    
    @NotBlank
    @Size(min = 2, max =15,message = "Surname must be between 2 and 15 characters long")
    @Column(name="last_name")
	private String lastName;
    
    @NotBlank
    @Size(max=25)
    @Pattern(regexp="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")
    @Column(name="email_id")
	private String email;

    @NotBlank
    @Size(min=10,max=12,message ="Phone No must be start from (6,7,8,9) and 10 digit long")
    @Pattern(regexp="[6789][0-9]{9}")
    @Column(name="phone_No")
	private String phoneNo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
