package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	public void method1() {
		//�Ź� ����ڿ��� ���ڿ��� �Է¹��� ��
		//�ش� ���ڿ��� ���̸� �������.
		//��, ����ڰ� 'exit'�� �Է��ϸ� �ݺ����� ����������.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //���� �ݺ�
			
			System.out.println("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; //���ѹݺ� ����
			}
			System.out.println("���ڿ��� ���̴� : "+str.length());
		}
		
		System.out.println("����ڰ� exit�� �Է��Ͽ� ���α׷��� �����մϴ�.");
	}
	public void method2() {
		//�Ź� ����ڿ��� ���ڸ� �Է¹ް�
		//���� �ش� ���ڰ� �����̸� "���α׷��� �����մϴ�" ��� ������ ����غ�����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڸ� �Է����ּ���");
			int num = sc.nextInt();
			
			if(num<0) {
				break;
			}
			System.out.println("����  : "+num);
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
