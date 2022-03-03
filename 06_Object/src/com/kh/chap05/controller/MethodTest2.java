package com.kh.chap05.controller;

public class MethodTest2 {

	// static 메소드 만들기
	
	//1.리턴값 매개변수 둘 다 없는 메소드
	
	
	public static void method1() {
		System.out.println("리턴값과 매개변수 둘 다 없는 메소드입니다.");
	}
	//2. 리턴값 있고 매개변수 없는 메소드
	public static String method2() {
		
		return "리턴값은 있고 매개변수는 없는 메소드입니다.";
	}
	
	//3. 리턴값은 없고 매개변수는 있는 메소드
	public static void method3(String name,int age) {
		System.out.println(name+"님의 나이는 "+age+"입니다.");
	}
	//4. 리턴값 매개변수 둘다 있는 메소드
	public static int method4(int age) {
		return age;
	}
}
