package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*
	 * ��� ������ -> ���� �����ڷμ� ������, �켱 ������ �Ϲ� ���� ����̶� �����ϴ�.
	 * */
	
	
	// + : ����
//	- : ����
//	* : ������
//	% : ��ⷯ
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 :" +(num1+num2));
		System.out.println("num1 + num2 :" +num1+num2);
		//num1 + num2 ��ȣ�� ���� �ʰ� ����ϸ� ���ڿ�ó�� ���� 10�� 3�� ���ڿ� �������� ��ġ�� ������ 103�� ��µȴ�.
		
		System.out.println("num1 + num2 :" +(num1+num2));
		System.out.println("num1 + num2 :" +num1%num2);
		
		// �������� ���� ��ȣ�� �����ִ°� ����.
		
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
		
		System.out.println("�ο� �� :");
		int person = sc.nextInt();
		
		System.out.println("���� ���� :");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� �� �ִ� ���� ���� : "+ (candy / person));
		System.out.println("���� ������ ����: "+(candy % person));
	}
}
