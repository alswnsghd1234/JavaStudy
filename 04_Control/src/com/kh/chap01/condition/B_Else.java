package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * 
	 * [ǥ����]
	 * 
	 * if(���ǽ�){
	 * 		���ǽ��� true �� ��� ���� ���� ���� 1
	 * }
	 * else{
	 * 		���ǽ��� false �� ��� ���� �� �ڵ� 2
	 * }
	 * ���ǽ��� ����� true �� ��� 1�� �ڵ�
	 * ���ǽ��� ����� false �� �� �� 2 ���ڵ�
	 * if��else�� �� ���̴�. 
	 * 
	 * 
	 * 
	 * */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		
		int num = sc.nextInt();
		
		if(num>0) {// ��� �� ��� ����
			System.out.println("����Դϴ�.");
		}
		else{
			// 0�� ���
			if(num==0) {
				System.out.println("0�̴�.");
			}
			else {
				System.out.println("�����Դϴ�.");	
			}
		}
}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ �Է� : ");
		
		String personId = sc.nextLine();
		char gender = personId.charAt(7);
		
		if((gender=='1') || (gender=='3')) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}
	
}
