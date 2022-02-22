package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {
	
	/*
	 * 
	 * 단독 if문
	 * 
	 * [표현식]
	 * if(조건식) {
	 * 		조건식이 참/true일 경우에 실행 될 코드.
	 * }
	 * 
	 * -> 조건식의 결과가 true일 경우 : 중괄호 안에 있는 코드를 실행.
	 * -> 조건식의 결과가 false일 경우 : 중괄호 안에 있는 코드를 실행하지 않고 건너 뛴다.
	 * 
	 * 
	 * */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수입니다.");
		}
		if(num==0) {
			System.out.println("0입니다.");
		}
		if(num<0) {
			System.out.println("음수입니다.");
		}
		
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		
		int num = sc.nextInt();
		
		if((num%2==0) && (num >0)){
			System.out.println("짝수입니다.");
		}
		if (num%2!=0) {
			System.out.println("홀수입니다.");
		}
		
		// 중첩 if문
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("dd");
			}
		}
		
	}
	public void method3() {
		//1. 사용자로부터 주민번호 입력받기 (String personId => 024241 - 3XXXXX
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력(-)포함 : ");
		
		String personId = sc.nextLine();
		
		//2. 입력받은 주민번호 성별을 알아낼 수 있는 문자를 추출(charAt(7) -> 7번째 인덱스에 있는 값)
		
		char gender = personId.charAt(7);
		
		// 3. 성별에 해당하는 문자가 '1' 또는 '3' 일 경우  = > 남자
		
		// 2 또는 4 일 경우 여자
		
		if((gender=='1') || (gender=='3')){
			System.out.println("남자입니다.");
		}
		if((gender=='2') || (gender=='4')){
			System.out.println("여자입니다.");
		}
		if((gender!='1') && (gender!='3') && (gender!='2') && (gender!='4')) {
	}

}

		
	}
