package com.kh.interface1.model.vo;

public class HighSchoolStudent implements Basic,Student{

	@Override
	public void eat() {
		System.out.println("��1111");
	}

	@Override
	public void sleep() {
		System.out.println("��2222");
	}

	@Override
	public void study() {
		System.out.println("3333");
	}

	@Override
	public void fly() {
		System.out.println("��4444");
	}
	
	

}
