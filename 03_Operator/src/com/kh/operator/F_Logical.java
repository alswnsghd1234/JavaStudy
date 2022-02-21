package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리 연산자 : 이항연산자 , 두 개의 논리값을 연산하는 연산자.
	 * [표현법] 논리값 논리 연산자 논리값 -> 결과값도 논리값
	 * 
	 * 
	 * 1. AND 연산자 : 논리값 && 논리값
	 * 왼쪽 오른쪽 둘 다 결과가 true 여야 최종결과가 true
	 * 2. OR 연산자 : 논리값 || 논리값
	 * 
	 * 
	 * */
	
	//AND
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		boolean result = (num>0) && (num % 2)==0;
		//&& 의 의미: ~이면서, ~이고, 그리고
		
		System.out.println("num이 양수이면서 짝수입니까? "+result);
	
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num >=1) && (num<=100);
		System.out.println("1이상 100이하입니까? : " + result);
	}
	
	public void method3() {
		
		// 사용자가 입력한 값이 M 인지 m 인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 입력 : ");
		
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender=='M')||(gender=='m');
		System.out.println("당신은 남자입니까? : "+ result);
		
	}
	
	public void method4() {
		
		int num = 10;
		
		boolean result = false &&(num>0);
	}
}
