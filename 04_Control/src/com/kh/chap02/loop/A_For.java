package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	
	/*
	 * for문
	 * 괄호 안의 반복을 지정하는 부분이 있고,
	 * 초기식,조건식,증감식 세가지로 이루어진다.
	 * 각각 세미콜론으로 구분된다.
	 * 
	 * [표현법]
	 * 
	 * for(초기식;조건식;증감식){// 반복 횟수를 결정짓는 요소들.
	 * 반복적으로 실행하고 싶은 코드
	 * }
	 * 
	 * 초기식 : 반복문이 시작 될 때 " 초기식에 단 한번만 실행 " 될 구문.
	 * 		 반복문이 사용할 변수를 선언하고 초기화하는 구문.
	 * 		ex)int i=0;
	 * 
	 * 조건식 : "반복문이 실행될 조건"을 작성하는 구문.
	 * 			조건식이 true 일 경우에 반복문을 실행한다.
	 * 			조건식이 false 일 경우에 반복문을 빠져나온다.
	 * 			보통 초기식에서 만든 변수를 가지고 조건식에 작성.
	 * 			exi<10;
	 * 증감식  : 반복문을 제어하는 변수 값을 증감시키는 구문.
	 * 			보통 초기식에서 만든 볌ㄴ수를 가지고 증감식을 작성.
	 * 			이때 증감 연산자가 보통 사용된다.
	 * 			ex) i++ ++i
	 * 
	 * for문을 만나는 순간
	 * 초기식->조건식 (검사)->true일 경우 {}안에 있는 코드를 실행한다 -> 증감식
	 * 		->조건식(검사)-> true일 경우 실행 -> 증감식
	 * 		->조건식....
	 * 		...
	 * 		...
	 * 		-> 조건식 (검사) -> false일 경우 코드 실행하지 않고 반복문 탈출
	 * 
	 * 조건식을 검사했을때 true여야만 반복문이 실행 된다.
	 * 
	 * 
	 * */
	
	public void method1() {
		
		//안녕하세요 5번 반복해서 하고 싶어요
		
		for(int i=0;i<5;++i) {
			System.out.println("안녕하세요.");
		}
		
		for(int i=0;i<8;i++) {
			System.out.println("반갑습니다.");
		}
		
		for(int i=10;i>=6;i--) {
			System.out.println(i);
		}
		// i가 2씩 증가하게 만들어보자
		// 0 2 4 6 8 10
		for(int i=0;i<11;i+=2) {
			System.out.println(i);
		}
		//초기식, 조건식, 증감식이 없어도 문법적 오류가 아니다.
		// 다만, 이 경우에는 조건식 부분이 true로 인식이 되어 무한 반복이 된다.
		
		for(;;) {
			System.out.println("No");
			break;
		}
	}
	public void method2() {
		
		//문자 추출
		
		String str = "오늘 날씨가 많이 춥네요";
		
		for(int i =0;i<str.length();i++) {
			System.out.println(i+"번째 문자 출력"+str.charAt(i));
		}
	}
	
	public void method5() {
		// 구구단을 만듭니다
		//입력된 숫자가 1이상 9이하 일 때만 구구단을 실행하도록 하세요
		//잘못된 수가 들어오면 잘못된 수 입니다. 1~9사이의 값을 입력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt(); 
		
		int result = 0; // 결과값을 담아놓고 싶으면 만들어놓기.
		
		//(조건문) 입력된 숫자가 1이상 9이하 일 때만 실행할거야
		if(0<dan&&dan<10) {
			
			for(int i=1;i<10;i++) {
				result = dan*i;
				System.out.printf("%d * %d = %d \n", dan,i,result);
			}
		}
		
		else {
			System.out.println("잘못된 수 입니다. 1~9사이의 값을 입력해주세요.");
		}
		
		
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt(); 
		
		if(num1>0 && num2>0) {
			if(num1>num2) {
				for(int i=num2;i<=num1;i++) {
					System.out.println(i);
				}
			}
			else {
				for(int i=num1;i<=num2;i++) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	public void method7() {
		
		
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			for(int j=1;j<=15;j++) {
			
				System.out.println(j);
			}
		}
		
	}
	public void method8() {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
//		for(int i=1;i<=num;i++) {
//			 for(int j=1;j<=i;j++) {
//				 System.out.print("*");
//			 }
//			System.out.println("");
//			
//		}
		for(int i=1;i<=num;i++) {
			 for(int j=num;j>0;j--) {
				 if(i<j) {
					 System.out.print(" ");
				 }
				 else {
					 System.out.print("*");
				 }
			System.out.println("");
			 }
			
			
		}
	}
}
