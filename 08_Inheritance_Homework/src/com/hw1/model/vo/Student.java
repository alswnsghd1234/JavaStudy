package com.hw1.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	

	public Student() {
		super();
	}
	
	public Student(String name,int age, double height, double weight,int grade, String major) {
		super(age,height,weight);
		super.setName(name);
		this.grade = grade;
		this.major = major;
	}
	public String information() {
		return super.information()+" "+grade+" "+major;
	}
	
}
