package com.kh.chap05.controller;

public class MethodTest2 {

	// static �޼ҵ� �����
	
	//1.���ϰ� �Ű����� �� �� ���� �޼ҵ�
	
	
	public static void method1() {
		System.out.println("���ϰ��� �Ű����� �� �� ���� �޼ҵ��Դϴ�.");
	}
	//2. ���ϰ� �ְ� �Ű����� ���� �޼ҵ�
	public static String method2() {
		
		return "���ϰ��� �ְ� �Ű������� ���� �޼ҵ��Դϴ�.";
	}
	
	//3. ���ϰ��� ���� �Ű������� �ִ� �޼ҵ�
	public static void method3(String name,int age) {
		System.out.println(name+"���� ���̴� "+age+"�Դϴ�.");
	}
	//4. ���ϰ� �Ű����� �Ѵ� �ִ� �޼ҵ�
	public static int method4(int age) {
		return age;
	}
}