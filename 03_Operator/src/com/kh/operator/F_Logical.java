package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * �� ������ : ���׿����� , �� ���� ������ �����ϴ� ������.
	 * [ǥ����] ���� �� ������ ���� -> ������� ����
	 * 
	 * 
	 * 1. AND ������ : ���� && ����
	 * ���� ������ �� �� ����� true ���� ��������� true
	 * 2. OR ������ : ���� || ����
	 * 
	 * 
	 * */
	
	//AND
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		
		boolean result = (num>0) && (num % 2)==0;
		//&& �� �ǹ�: ~�̸鼭, ~�̰�, �׸���
		
		System.out.println("num�� ����̸鼭 ¦���Դϱ�? "+result);
	
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		boolean result = (num >=1) && (num<=100);
		System.out.println("1�̻� 100�����Դϱ�? : " + result);
	}
	
	public void method3() {
		
		// ����ڰ� �Է��� ���� M ���� m ���� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender=='M')||(gender=='m');
		System.out.println("����� �����Դϱ�? : "+ result);
		
	}
	
	public void method4() {
		
		int num = 10;
		
		boolean result = false &&(num>0);
	}
}
