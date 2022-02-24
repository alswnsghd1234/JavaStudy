package com.kh.chap02.loop;

public class C_DoWhile {

	/*
	 * d-while문
	 * 별도의 조건 검사 없이 처음 한번 무조건 실행 된다.
	 * while(false) : 처음 한번은 실행된다는 뜻
	 * 
	 * [표현법]
	 * 
	 * 초기식 // 필수는 아님
	 * 
	 * do {
	 * 		실행코드
	 * 		증감식 // 필수는 아님
	 * 
	 * 
	 * }while(조건식);
	 * 
	 * whlie과의 차이
	 * 
	 * do-while문은 조건식에 상관없이 처음 1회는 실행된다.
	 * while문은 조건식이 참(true)여야만 실행된다.
	 * 
	 * 
	 * 
	 * */
	
	public void method1() {
		do {
			System.out.println("ddd");
			
		}while(false);
		
		
	}
	public void method2() {
		int i =1;
		do {
			
			System.out.println(i);
			i++;
			
		}while(i<=5);
	}
}
