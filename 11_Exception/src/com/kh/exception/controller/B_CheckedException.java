package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * CheckedException
	 * 문법적으로 반드시 예외처리를 해줘야 하는 예외들
	 * (즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해야함)
	 * ->주로 외부 매체와 어떤 입출력 시 발생!
	 * 
	 * CheckedException은 RuntimeException을 제외한 Exception들
	 * 프로그램 실행 전 발생 - 컴파일 에러가 난다 - 예외처리 필수로 해줘야 프로그램을 실행시킬 수 있음.
	 * 
	 * 
	 * */

	public void method1() throws Exception { //만약 throws로 떠넘길때 어떤 구문이던 넘기고 싶다면 
										     //exception의 최고조상인 Exception을 적어주면 된다.
//		여기서 예외처리구문 try catch를 하던지 
//		try {
//			method2();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		여기서도 던져버리기 
		method2();
		
	}
	
	//method2에서 발생한 예외를 method1로 떠넘겨보자 
	//throws 예외클래스이름
	public void method2() throws Exception { //나를 호출한 곳으로 예외를 던져버리기.
	//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(문자열만 가능)
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	try {
//		String str = br.readLine(); //이 메소드를 호출 시 IOException이 발생할지도 모르니 예외처리해라.
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	String str = br.readLine();
	str=null;
		
	System.out.println(str.length());
	}
	
	
	//메소드를 만들어서 예외를 발생시키고 throws로 넘겨보기 
	//throws new exception이름 원하는거
	
	public void method3() {
		throw new RuntimeException();
	}
	
	public void method4() throws Exception {
		method3();
		throw new Exception();
	
	}
	
}
