package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	
	/*
	 * for��
	 * ��ȣ ���� �ݺ��� �����ϴ� �κ��� �ְ�,
	 * �ʱ��,���ǽ�,������ �������� �̷������.
	 * ���� �����ݷ����� ���еȴ�.
	 * 
	 * [ǥ����]
	 * 
	 * for(�ʱ��;���ǽ�;������){// �ݺ� Ƚ���� �������� ��ҵ�.
	 * �ݺ������� �����ϰ� ���� �ڵ�
	 * }
	 * 
	 * �ʱ�� : �ݺ����� ���� �� �� " �ʱ�Ŀ� �� �ѹ��� ���� " �� ����.
	 * 		 �ݺ����� ����� ������ �����ϰ� �ʱ�ȭ�ϴ� ����.
	 * 		ex)int i=0;
	 * 
	 * ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����.
	 * 			���ǽ��� true �� ��쿡 �ݺ����� �����Ѵ�.
	 * 			���ǽ��� false �� ��쿡 �ݺ����� �������´�.
	 * 			���� �ʱ�Ŀ��� ���� ������ ������ ���ǽĿ� �ۼ�.
	 * 			exi<10;
	 * ������  : �ݺ����� �����ϴ� ���� ���� ������Ű�� ����.
	 * 			���� �ʱ�Ŀ��� ���� �٤����� ������ �������� �ۼ�.
	 * 			�̶� ���� �����ڰ� ���� ���ȴ�.
	 * 			ex) i++ ++i
	 * 
	 * for���� ������ ����
	 * �ʱ��->���ǽ� (�˻�)->true�� ��� {}�ȿ� �ִ� �ڵ带 �����Ѵ� -> ������
	 * 		->���ǽ�(�˻�)-> true�� ��� ���� -> ������
	 * 		->���ǽ�....
	 * 		...
	 * 		...
	 * 		-> ���ǽ� (�˻�) -> false�� ��� �ڵ� �������� �ʰ� �ݺ��� Ż��
	 * 
	 * ���ǽ��� �˻������� true���߸� �ݺ����� ���� �ȴ�.
	 * 
	 * 
	 * */
	
	public void method1() {
		
		//�ȳ��ϼ��� 5�� �ݺ��ؼ� �ϰ� �;��
		
		for(int i=0;i<5;++i) {
			System.out.println("�ȳ��ϼ���.");
		}
		
		for(int i=0;i<8;i++) {
			System.out.println("�ݰ����ϴ�.");
		}
		
		for(int i=10;i>=6;i--) {
			System.out.println(i);
		}
		// i�� 2�� �����ϰ� ������
		// 0 2 4 6 8 10
		for(int i=0;i<11;i+=2) {
			System.out.println(i);
		}
		//�ʱ��, ���ǽ�, �������� ��� ������ ������ �ƴϴ�.
		// �ٸ�, �� ��쿡�� ���ǽ� �κ��� true�� �ν��� �Ǿ� ���� �ݺ��� �ȴ�.
		
		for(;;) {
			System.out.println("No");
			break;
		}
	}
	public void method2() {
		
		//���� ����
		
		String str = "���� ������ ���� ��׿�";
		
		for(int i =0;i<str.length();i++) {
			System.out.println(i+"��° ���� ���"+str.charAt(i));
		}
	}
	
	public void method5() {
		// �������� ����ϴ�
		//�Էµ� ���ڰ� 1�̻� 9���� �� ���� �������� �����ϵ��� �ϼ���
		//�߸��� ���� ������ �߸��� �� �Դϴ�. 1~9������ ���� �Է����ּ���.
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt(); 
		
		int result = 0; // ������� ��Ƴ��� ������ ��������.
		
		//(���ǹ�) �Էµ� ���ڰ� 1�̻� 9���� �� ���� �����Ұž�
		if(0<dan&&dan<10) {
			
			for(int i=1;i<10;i++) {
				result = dan*i;
				System.out.printf("%d * %d = %d \n", dan,i,result);
			}
		}
		
		else {
			System.out.println("�߸��� �� �Դϴ�. 1~9������ ���� �Է����ּ���.");
		}
		
		
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt(); 
		
		System.out.println("�� ��° ���� : ");
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
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
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
		System.out.println("���� �Է� : ");
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
