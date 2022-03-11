package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BCheckedException {

	/*
	 * CheckedException
	 * 문법적으로 반드시 예외처리를 해줘야 하는 예외들
	 * (즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해야함)
	 * -> 주로 외부 매체와 어떤 입출력 시 발생!
	 * 
	 * */
	
	public void method1() {
		
	}
	//method2 에서 발생한 예외를 method1로 떠넘겨보자
	//throws 예외클래스이름
	public void method2() throws IOException {
	//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(문자열만 가능)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		try {
//			String str = br.readLine(); //이 메소드를 호출 시 IOException이 발생할지도 모르니 예외처리해라.
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String string = br.readLine();
	}
	public void method3() {
		
		throw new RuntimeException();
		
	}
	public void method4() throws Exception{
		
	}
}
