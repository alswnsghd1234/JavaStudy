package com.kh.chap01.condition;

import java.util.Scanner;

public class Test {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǿ�����1 �Է� : ");
		double num = sc.nextDouble();
		System.out.println("�ǿ�����2 �Է� : ");
		
		double num2 = sc.nextDouble();
		
		System.out.println("�����ڸ� �Է�( +,-,*,/,%) : ");
		
		sc.nextLine();
		
		String calc = sc.nextLine();
		
		double result = 0;
		
		if((num>0)&&(num2>0)) {
			switch (calc){
			case "+": result = num +num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);
				break;
			case "-": result = num -num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);
				break;
			case "*": result = num *num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);
				break;
			case "%": result = num %num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);
				break;
			case "/": result = num /num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);
				break;
			default:{
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
			
			}
		}
		
		
}
	public void Test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǿ�����1 �Է� : ");
		double num = sc.nextDouble();
		System.out.println("�ǿ�����2 �Է� : ");
		
		double num2 = sc.nextDouble();
		
		System.out.println("�����ڸ� �Է�( +,-,*,/,%) : ");
		
		sc.nextLine();
		
		String calc = sc.nextLine();
		
		double result = 0;
		
		if((num>0)&&(num2>0)) {
			if (calc.equals("+")) {
				result = num +num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);				
			}
			else if (calc.equals("-")) {
				result = num -num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);				
			}
			else if (calc.equals("*")) {
				result = num *num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);				
			}
			else if (calc.equals("%")) {
				result = num %num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);				
			}
			else if (calc.equals("/")) {
				result = num /num2;
				System.out.printf("%f %s %f = %f",num,calc,num2,result);				
			}
			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
}