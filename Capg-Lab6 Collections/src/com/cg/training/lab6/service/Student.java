package com.cg.training.lab6.service;

public class Student {

	private String name;
	private Integer rollNo;
	private Integer marks;
	private StudentMedal medal;
	
	public Student() {
		
	}
	
	public Student(String name, Integer rollNo, Integer marks, StudentMedal medal) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.medal = medal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public StudentMedal getMedal() {
		return medal;
	}
	public void setMedal(StudentMedal medal) {
		this.medal = medal;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", medal=" + medal + "]";
	}
	
	
	
}
