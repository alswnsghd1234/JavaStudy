package com.kh.array;

import java.util.Scanner;

public class ArrayTest {

	public void HomeWork() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		
		int num = sc.nextInt();
		
		String[] day = new String[] {"��","ȭ","��","��","��","��","��"};
		
		if((num>=0)&&(num<day.length)) {
			System.out.println(day[num]);
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		}
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ġŲ �̸��� �Է��ϼ���");
		
		
		String[] menu = {"�Ĵ�","���Ĵ�","����","���","�Ķ��̵�"};
		
		String choice = sc.nextLine();
		String rs = "";
		
		for(int i=0;i<menu.length;i++) {
			if(choice.equals(menu[i])) {
				rs = choice+"��ް���";
				break;
			}
			else {
				rs = choice+"���� �޴�";

			}

		}
		System.out.println(rs);
		
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		int count = str.length();
		
		// �ߺ��� Ȯ���ϰ� �ߺ��� ��쿡 ���� ���� �ʴ´�.
		
		
		String temp = "";
		//�Է¹��� ���ڿ��� ���̸�ŭ �迭�� ���� �� �� �ִ�.
		char[] cArr = new char[str.length()];
		
		String rs = "���ڿ��� �ִ� ���� :"+str.charAt(0)+",";
		
		//���ڿ��� � ���ڰ� ������ Ȯ���ϰ� �� ���ڸ� �迭�� ��Ƽ� �ϳ��ϳ��� �����ؼ� ���
		//���������� ������ ���� ��ȯ
		for(int i=0;i<str.length();i++) {
			cArr[i] = str.charAt(i);
			
			for(int j=0;j<i;j++) {
				
				if(str.charAt(i)==cArr[j]) {
					
					count--;
					break;
				}
				else if(j==i-1&&(cArr[j]!=str.charAt(i))) {
					
					rs= rs+str.charAt(i)+",";
				}
			}
			
//			if(!(i==(cArr.length-1))) {
//				System.out.println(cArr[i]+",");
//			}else {
//			System.out.println(cArr[i]);
//		}
	}
		System.out.println("���ڿ��� ���� : "+rs);
		System.out.println("������ ���� : "+count);
}
}