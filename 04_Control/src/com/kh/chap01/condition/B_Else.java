package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * 
	 * [표현법]
	 * 
	 * if(조건식){
	 * 		조건식이 true 일 경우 실행 도맄 도ㅡ 1
	 * }
	 * else{
	 * 		조건식이 false 일 경우 실행 될 코드 2
	 * }
	 * 조건식의 결과가 true 일 경우 1번 코드
	 * 조건식의 결과가 false 일 경 우 2 번코드
	 * if와else는 한 쌍이다. 
	 * 
	 * 
	 * 
	 * */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		
		int num = sc.nextInt();
		
		if(num>0) {// 양수 일 경우 실행
			System.out.println("양수입니다.");
		}
		else{
			// 0일 경우
			if(num==0) {
				System.out.println("0이다.");
			}
			else {
				System.out.println("음수입니다.");	
			}
		}
}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력 : ");
		
		String personId = sc.nextLine();
		char gender = personId.charAt(7);
		
		if((gender=='1') || (gender=='3')) {
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
	}
	
}
