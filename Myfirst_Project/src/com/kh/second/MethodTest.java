package com.kh.second;

public class MethodTest {

	public static void main(String[] args) {
		
//		methodA();
		methodB();
		methodC();
		
		
	}
	
	public static void methodA() {
		//실행할 내용
		System.out.println("메소드 A 실행");
	}
	public static void methodB() {
		//실행할 내용
		methodA();
		System.out.println("메소드 B 실행");
	}
	public static void methodC() {
		//실행할 내용
		System.out.println("메소드 C 실행");
	}
}
