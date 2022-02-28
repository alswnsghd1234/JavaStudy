package com.kh.chap02.encapsulation.model.vo;

public class Student {
	/*
	 	�ʵ�� 
	 	�������� ��� �κ�
	 	
	 	�ʵ� == �������� == ������� == �ν��Ͻ� ����
	 	
	 	���������� �ڷ��� �ʵ��;
	 	
	 * */
	
	//�̸� ���� ���� ���ܼ�
	private String name;
	private int age;
	private char gender;
	public int ane;
	/*
	 * �� ��ɵ��� ����ϴ� �κ�
	 * [ǥ����]
	 * ���������� ��ȯ�� �޼ҵ��̸�(�Ű�����){
	 * public void method1(){
	 * 	�����ϰ��� �ϴ� �ڵ�
	 * }
	 * 
	 * ->���������ڴ� ������ �� �ִ� ������ �����Ѵ�.
	 * ->��ȯ���� �޼ҵ��� ������� �ڷ����� �����Ѵ�. void�� �����ִ� ���� ���ٴ� �ǹ�
	 * ->�Ű����� : �޼ҵ� ȣ�� �� �Է°����� �־��ִ� ����. �ش� �޼ҵ� �����߿��� ��� ����. (������ �����ϴ�)
	 * 
	 * 
	 * */
	
	//�����͸� ��� �� �����ϴ� �޼ҵ� : setter �޼ҵ�
	/*
	 * ��Ģ
	 * 1. setter �޼ҵ�� ������ �����ؾ��ϱ� ������ public ���������ڷ� ���
	 * 2. set�ʵ�� �̸����� ���� ��Ÿ�� ǥ����� ��Ų��.
	 * ex)setName,setAge,setGender �̷������� set �ڿ����� ù ���ĺ� �빮�ڷ� ���ش�.
	 * 3. ��� �ʵ忡 ���� �ۼ������ �ȴ�.
	 * 
	 * */
	
	public void setName(String name) {
		
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String information() {
		return name+"���� ���̴�"+age+"���̰� ������"+gender+"�Դϴ�";
		
	}
	
}
