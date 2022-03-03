package com.kh.chap05.controller;

public class OverloadingTest {

	/*
	 * 메소드 오버로딩
	 * - 한 클래스 안에 같은 메소드명으로 여러 메소드를 정의 할 수 있는 방법
	 * - 매개변수의 자료형의 개수 , 순서, 종류가 다르게 작성되어야한다.
	 * 주의) 매개변수명
	 * */
	
	// 메소드 이름은 test로 통일하여 작성하자
	
	public void test() {
		System.out.println("문자열");
		System.out.println(15);
		System.out.println(16.6);
		System.out.println('차');
		System.out.println(true);
		
	}
	public void test(int a) {
		
		
	}
	
	public void test(int a ,String b) {
		
	}
	
	//public void test(int b) {} 매개변수명으로는 구별 불가
	
	public void test(String a) {
		
	}
	
//	public String test(String a) {반환형은 오버로딩에 영향을 주지 않음
//		return a
//	 }
	
//	private void test(String b) {
//		//접근제한자는 오버로딩에 영향을 주지않음
//	}
	
	public void method1() {
		System.out.println("printAll");
	}
	public void method1(String name) {
		System.out.println(name+"name이오");
		
	}
	public void method1(String name, int age) {
		System.out.println(name+age);
	}
}
