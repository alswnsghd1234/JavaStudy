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
}
