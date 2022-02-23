package com.kh.chap03.branch;

import java.util.Scanner;

public class Test {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("연산자(+,-,*,/,%)");
			String calc = sc.nextLine();
			
			if(calc.equals("exit")) {
				break;
			}
			System.out.println("정수1 :");
			int num1 = sc.nextInt();
			System.out.println("정수2 :");
			int num2 = sc.nextInt();
			
			if(calc.equals("+")) {
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			}
			else if(calc.equals("-")) {
				System.out.println(num1+"-"+num2+"="+(num1-num2));
			}
			else if(calc.equals("%")) {
				System.out.println(num1+"%"+num2+"="+(num1%num2));
			}
			else if(calc.equals("/")) {
				if(num2==0) {
					System.out.println("분모에 0이 오면 안된다.");
				}
				else {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				}
			}
			else if(calc.equals("+")) {
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			}
			else {
				System.out.println("그런 연산자 없습니다.");
			}
			
}
}
}