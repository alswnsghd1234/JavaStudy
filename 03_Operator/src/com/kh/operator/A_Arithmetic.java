package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*
	 * 산술 연사자 -> 이항 연산자로서 연산방법, 우선 순위가 일반 수학 산술이랑 동일하다.
	 * */
	
	
	// + : 덧셈
//	- : 뺄셈
//	* : 나눗셈
//	% : 모듈러
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 :" +(num1+num2));
		System.out.println("num1 + num2 :" +num1+num2);
		//num1 + num2 괄호로 묶지 않고 출력하면 문자열처럼 각각 10과 3을 문자열 덧셈으로 합치기 때문에 103이 출력된다.
		
		System.out.println("num1 + num2 :" +(num1+num2));
		System.out.println("num1 + num2 :" +num1%num2);
		
		// 가독성을 위해 괄호로 묶어주는게 좋다.
		
//		System.out.println(10/0);
//		System.out.println(10%0);
		
		double d1 = 35; // 35.0
		double d2 = 10; // 10.0
		
		System.out.println("d1 + d2 : "+(d1+d2));
		System.out.println("d1 - d2 : "+(d1-d2));
		System.out.println("d1 * d2 : "+(d1*d2));
		System.out.println("d1 % d2 : "+(d1%d2));
		
	}
	public void methodCandy() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 :");
		int person = sc.nextInt();
		
		System.out.println("사탕 갯수 :");
		int candy = sc.nextInt();
		
		System.out.println("1인당 가질 수 있는 사탕 개수 : "+ (candy / person));
		System.out.println("남은 사탕의 개수: "+(candy % person));
	}
}
