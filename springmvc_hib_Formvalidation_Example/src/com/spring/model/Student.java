package com.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Student 
{
	@NotEmpty(message="please enter your name")
	private String StudentName;
	@NotEmpty(message="please enter your address")
	private String StudentAddress;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	

}
