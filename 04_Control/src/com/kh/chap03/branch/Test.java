package com.kh.chap03.branch;

import java.util.Scanner;

public class Test {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������(+,-,*,/,%)");
			String calc = sc.nextLine();
			
			if(calc.equals("exit")) {
				break;
			}
			System.out.println("����1 :");
			int num1 = sc.nextInt();
			System.out.println("����2 :");
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
					System.out.println("�и� 0�� ���� �ȵȴ�.");
				}
				else {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				}
			}
			else if(calc.equals("+")) {
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			}
			else {
				System.out.println("�׷� ������ �����ϴ�.");
			}
			
}
}
}