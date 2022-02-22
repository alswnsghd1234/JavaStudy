package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * switch��
	 * 
	 * [ǥ����]
	 * 
	 * switch(�Ʒ��� ����� ����� ���� �񱳸� �� �����){
	 * 
	 * case ��1 : ���� �� �ڵ�1; //����� ==��1 �� ���� �� �� �� true�� �� ���� �� �ڵ�
	 * break; // switch ������ ����������.
	 * 
	 * case ��2 : ���� �� �ڵ�2; // ����� == ��2�� ������ �� �� true �� �� ���� �� �ڵ�
	 * break;
	 * 
	 * case �� n : ������ �ڵ�n ; //����� == ��n�� ������ �� �� true�� �� ���� �� �ڵ�
	 * 
	 * default : ������ �ڵ�; // if-else ������ else�� ���Ұ� �����ϰ� �۵��Ǵ� �⺻ ���� �κ�
	 * 						(case1~N���� ����ڿ� ��ġ���� �ʴ� ��� �����Ѵ�. break ���� ����)
	 * }
	 * 
	 * switch���� if���� ������
	 * if(���ǽ�) => ���ǽ��� �����ϰ� ��� ����, ���� ������ ���� ����
	 * switch => ���ǽ� X , Ȯ���� ���� ��� ����.(����񱳸� ������ �� �ֽ��ϴ�.)
	 * 
	 * */
	public void method1() {
		//Ȧ�� ¦�� �Ǻ�(��� ������ �Ǵ����� �ʰڴ�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�. : ");
		
		int num = sc.nextInt();
		
		int isNum = num%2;
		
		switch(isNum) {
		
		case 0 : System.out.println("¦���Դϴ�.");
		break;
		
		case 1 : System.out.println("Ȧ���Դϴ�.");
		break;
		
		// 0�� ���� ¦���� �Ǵ��� �Ǳ� ������ default�� ����� �� �����ϴ�.
		//0�ϰ�츦 �����ϸ� switch���� ����ϴ°� �������� �ʴ�.
		}
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ���. : ");
		
		
		String personId = sc.nextLine();
		
		char gender =personId.charAt(7);
		
		switch (gender) {
		
		case '1' : case '3' : System.out.println("�����Դϴ�.");
		break;
		case '2' : case '4' : System.out.println("�����Դϴ�.");
		break;
		default : System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
		}
	}
	public void method3() {
		//����ڿ��� ������ ������ �̸��� �Է¹޾� �� ������ ������ ����� ��.
		
		// ��� 1000�� ������ 2000�� ���� 5000��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��ϼ���(���, ������, ����)");
		
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		
		case "���" : price =1000;
					System.out.println("����� ������ "+price+"�� �Դϴ�.");
		break;
		
		case "������" : price = 2000;
					System.out.println("�������� ������"+price+"�� �Դϴ�.");
		break;
		
		default : System.out.println("�Ǹ��ϰ� �ִ� ������ �ƴմϴ�.");
		}
		
		System.out.printf("%s�� ������ %d�� �Դϴ�", fruit,price);

	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� : ");
		int ko = sc.nextInt();
		System.out.println("�������� : ");
		int math = sc.nextInt();
		System.out.println("�������� : ");
		int en = sc.nextInt();
		
		int result = ko+math+en;
		double avg = result/3;
		
		if((ko>40) && (math>40) && (en>40) &&(avg>60)) {
						System.out.println("�������� : "+ko+"\n�������� : "+math+"\n�������� : "+en+"\n�հ� :" + result+"\n��� :" +avg+"\n�����մϴ�. �հ��Դϴ�.");
					}
	
		else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
		int month = sc.nextInt();
		String season = "";
		
		switch (month) {
		case 1 : case 2 : case 12:
			System.out.println(season="�ܿ�");
		break;
		case 4 : case 5 : case 3:
			System.out.println(season="��");
		break;
		case 6 : case 7 : case 8:
			System.out.println(season="����");
		break;
		case 9 : case 10 : case 11:
			System.out.println(season="����");
		break;
		default :{
			System.out.println("�ش簪�� �����ϴ�.");
		
		}
	}
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		System.out.println("���̵� �Է��ϼ��� : ");
		String userpw = sc.nextLine();
		
		
	}
}