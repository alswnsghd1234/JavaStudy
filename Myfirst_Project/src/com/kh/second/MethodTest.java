package com.kh.second;

public class MethodTest {

	public static void main(String[] args) {
		
//		methodA();
		methodB();
		methodC();
		
		
	}
	
	public static void methodA() {
		//������ ����
		System.out.println("�޼ҵ� A ����");
	}
	public static void methodB() {
		//������ ����
		methodA();
		System.out.println("�޼ҵ� B ����");
	}
	public static void methodC() {
		//������ ����
		System.out.println("�޼ҵ� C ����");
	}
}
