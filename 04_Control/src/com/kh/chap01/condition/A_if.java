package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {
	
	/*
	 * 
	 * �ܵ� if��
	 * 
	 * [ǥ����]
	 * if(���ǽ�) {
	 * 		���ǽ��� ��/true�� ��쿡 ���� �� �ڵ�.
	 * }
	 * 
	 * -> ���ǽ��� ����� true�� ��� : �߰�ȣ �ȿ� �ִ� �ڵ带 ����.
	 * -> ���ǽ��� ����� false�� ��� : �߰�ȣ �ȿ� �ִ� �ڵ带 �������� �ʰ� �ǳ� �ڴ�.
	 * 
	 * 
	 * */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("����Դϴ�.");
		}
		if(num==0) {
			System.out.println("0�Դϴ�.");
		}
		if(num<0) {
			System.out.println("�����Դϴ�.");
		}
		
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		int num = sc.nextInt();
		
		if((num%2==0) && (num >0)){
			System.out.println("¦���Դϴ�.");
		}
		if (num%2!=0) {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		// ��ø if��
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("dd");
			}
		}
		
	}
	public void method3() {
		//1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId => 024241 - 3XXXXX
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ �Է�(-)���� : ");
		
		String personId = sc.nextLine();
		
		//2. �Է¹��� �ֹι�ȣ ������ �˾Ƴ� �� �ִ� ���ڸ� ����(charAt(7) -> 7��° �ε����� �ִ� ��)
		
		char gender = personId.charAt(7);
		
		// 3. ������ �ش��ϴ� ���ڰ� '1' �Ǵ� '3' �� ���  = > ����
		
		// 2 �Ǵ� 4 �� ��� ����
		
		if((gender=='1') || (gender=='3')){
			System.out.println("�����Դϴ�.");
		}
		if((gender=='2') || (gender=='4')){
			System.out.println("�����Դϴ�.");
		}
		if((gender!='1') && (gender!='3') && (gender!='2') && (gender!='4')) {
	}

}

		
	}
