package com.kh.array;

import java.util.Scanner;

public class ArrayTest {

	public void HomeWork() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		
		int num = sc.nextInt();
		
		String[] day = new String[] {"��","ȭ","��","��","��","��","��"};
		
		if((num>0)&&(num<day.length)) {
			System.out.println(day[num]);
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		
		
		}
}
