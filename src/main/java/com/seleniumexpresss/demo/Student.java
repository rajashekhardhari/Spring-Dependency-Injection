package com.seleniumexpresss.demo;

public class Student {

	private int id;
	private String studentName;

	
	public void setId(int id) {
		this.id = id;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void displayInfo() {
		System.out.println("Student name is  " +  studentName  +  " Student id is " + id);
	}
}
