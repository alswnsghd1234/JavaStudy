package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	public void method1() {
		//매번 사용자에게 문자열을 입력받은 후
		//해당 문자열의 길이를 출력하자.
		//단, 사용자가 'exit'를 입력하면 반복문을 빠져나간다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //무한 반복
			
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; //무한반복 멈춰
			}
			System.out.println("문자열의 길이는 : "+str.length());
		}
		
		System.out.println("사용자가 exit를 입력하여 프로그램을 종료합니다.");
	}
	public void method2() {
		//매번 사용자에게 숫자를 입력받고
		//만약 해당 숫자가 음수이면 "프로그램을 종료합니다" 라는 문구를 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해주세요");
			int num = sc.nextInt();
			
			if(num<0) {
				break;
			}
			System.out.println("음수  : "+num);
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
